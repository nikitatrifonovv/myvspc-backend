package com.ntsoftware.myvspc.newsservice.requests;

import com.ntsoftware.myvspc.newsservice.entities.dao.BlocksEntity;
import com.ntsoftware.myvspc.newsservice.entities.dao.MetaDataEntity;
import com.ntsoftware.myvspc.newsservice.entities.dao.NewsEntity;

import java.util.List;

public class NewsMetaBlocksRequest {

    private NewsEntity news;
    private MetaDataEntity meta;
    private List<BlocksEntity> blocks;

    public MetaDataEntity getMeta() {
        return meta;
    }

    public void setMeta(MetaDataEntity meta) {
        this.meta = meta;
    }

    public NewsEntity getNews() {
        return news;
    }

    public void setNews(NewsEntity news) {
        this.news = news;
    }

    public List<BlocksEntity> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<BlocksEntity> blocks) {
        this.blocks = blocks;
    }

    @Override
    public String toString() {
        return "NewsMetaBlocksRequest{" +
                "meta=" + meta +
                ", news=" + news +
                ", blocks=" + blocks +
                '}';
    }
}
