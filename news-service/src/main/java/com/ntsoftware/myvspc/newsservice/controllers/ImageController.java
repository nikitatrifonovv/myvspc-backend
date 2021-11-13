package com.ntsoftware.myvspc.newsservice.controllers;

import com.ntsoftware.myvspc.newsservice.entities.dao.ImagesEntity;
import com.ntsoftware.myvspc.newsservice.repositories.ImagesRepository;
import com.ntsoftware.myvspc.newsservice.services.BlocksService;
import com.ntsoftware.myvspc.newsservice.services.MetaDataService;
import com.ntsoftware.myvspc.newsservice.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.IOException;

//TODO Идетификация картинок по ID а не по ссылкам!!! Сделать!
@RestController
@RequestMapping(value = "/image", produces = MediaType.APPLICATION_JSON_VALUE)
public class ImageController {
    @Autowired
    NewsService newsService;

    @Autowired
    MetaDataService metaDataService;

    @Autowired
    BlocksService blocksService;

    @Autowired
    ImagesRepository imagesRepository;

    @PostMapping(value = "store", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String fileStore(MultipartRequest multipartFile) throws IOException {

        var image = multipartFile.getFiles("image").get(0);

        var name = image.getOriginalFilename();

        var bytes = image.getBytes();

        String imageDownloadUri;

        assert name != null;

        if(imagesRepository.findByName(name) == null){
            imagesRepository.save(new ImagesEntity(name,bytes));
        }

        var current_context = ServletUriComponentsBuilder.fromCurrentContextPath().build();

        //Ссылка сохраняется с локальным адресом
        imageDownloadUri = ServletUriComponentsBuilder.newInstance()
                .scheme(current_context.getScheme())
                .host("hostname")
                .port(current_context.getPort())
                .path("/image/")
                .path(name)
                .toUriString();

        return imageDownloadUri;
    }

    @GetMapping(value = "/{fileName:.+}", produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] downloadFile(@PathVariable String fileName) {

        //TODO image service
        ImagesEntity image =  imagesRepository.findByName(fileName);

        return image.getImage();
    }

    @GetMapping(value = "test")
    public String test() {



        return ServletUriComponentsBuilder.newInstance()
                .scheme(ServletUriComponentsBuilder.fromCurrentContextPath().build().getScheme())
                .host("hostname")
                .toUriString();
    }
}

