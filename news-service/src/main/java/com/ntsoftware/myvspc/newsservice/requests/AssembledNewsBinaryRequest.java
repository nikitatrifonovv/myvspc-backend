package com.ntsoftware.myvspc.newsservice.requests;

import com.ntsoftware.myvspc.newsservice.entities.dao.BlockEntity;
import com.ntsoftware.myvspc.newsservice.entities.dao.NewsEntity;
import lombok.Data;

import java.util.List;

@Data
public class AssembledNewsBinaryRequest {
    private NewsEntity news;
    private List<BlockEntity> blocks;
}
