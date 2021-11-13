package com.ntsoftware.myvspc.newsservice.responses.factories;

import com.ntsoftware.myvspc.newsservice.entities.dao.BlocksEntity;
import com.ntsoftware.myvspc.newsservice.responses.interfaces.IBlocksFactory;
import com.ntsoftware.myvspc.newsservice.services.BlocksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ComponentScan
public class BlocksFactory implements IBlocksFactory {

    public static String LOCAL_IP;

    @Autowired
    BlocksService blocksService;

    public BlocksFactory(BlocksService blocksService) {
        this.blocksService = blocksService;
    }

    @Override
    public List<BlocksEntity> getAllBlocksByNewsId(long id) {
        List<BlocksEntity> blocks = new ArrayList<>();

        for(var b : blocksService.getAllBlocksByNewId(id)){
            if(b.getType() == 1){
                blocks.add(b);
            }
            else if (b.getType() == 2) {
              var data = b.getData().replaceFirst("hostname", LOCAL_IP);
              b.setData(data);
              blocks.add(b);
            }

        }

        return blocks;
    }

    @Value("${app.hostAddress}")
    public void setLocalIp(String localIp) {
        LOCAL_IP = localIp;
    }
}
