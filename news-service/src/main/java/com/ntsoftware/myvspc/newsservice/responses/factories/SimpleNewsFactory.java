package com.ntsoftware.myvspc.newsservice.responses.factories;


import com.ntsoftware.myvspc.newsservice.entities.SimpleNews;
import com.ntsoftware.myvspc.newsservice.responses.SimpleNewsResponse;
import com.ntsoftware.myvspc.newsservice.responses.interfaces.INewsFactory;
import com.ntsoftware.myvspc.newsservice.responses.interfaces.NewsResponse;
import com.ntsoftware.myvspc.newsservice.services.MetaDataService;
import com.ntsoftware.myvspc.newsservice.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@ComponentScan
public class SimpleNewsFactory implements INewsFactory {

    public static String LOCAL_IP;

    @Autowired
    NewsService newsService;

    @Autowired
    MetaDataService metaDataService;

    public SimpleNewsFactory() {
    }

    @Value("${app.hostAddress}")
    public void setLOCAL_IP(String ip){
        LOCAL_IP = ip;
    }

    public SimpleNewsFactory(NewsService newsService, MetaDataService metaDataService) {
        this.newsService = newsService;
        this.metaDataService = metaDataService;
    }

    @Override
    public NewsResponse createNewsResponse() {

        List<SimpleNews> newsList = new ArrayList<>();

        for (var news : newsService.getAllNews()) {

            var meta = metaDataService.getMetaDataById(news.getMeta_data());



            var simple_news = new SimpleNews.Builder()
                    .id(news.getId())
                    .title(news.getTitle())
                    .subTitle(news.getSub_title())
                    .type(meta.getType())
                    .typeName(metaDataService.getTypeNameById(meta.getType()))
                    .creator(meta.getCreator())
                    .image(news.getImage().replaceFirst("hostname", LOCAL_IP)) //Для удобного отображения картинок в локальной сети на телефоне
                    .date(meta.getDate())
                    .build();

            newsList.add(simple_news);
        }

        newsList.sort((o1, o2) -> o2.getDate().compareTo(o1.getDate()));

        var response = new SimpleNewsResponse();
        response.setNewsList(newsList);
        return response;
    }

    @PostConstruct
    private String getIp(){
        return LOCAL_IP;
    }

}
