package com.ntsoftware.myvspc.newsservice.controllers;

import com.ntsoftware.myvspc.newsservice.services.ImageService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartRequest;

import java.io.IOException;
import java.util.UUID;

//TODO Идетификация картинок по ID а не по ссылкам!!! Сделать!
@RestController
@RequestMapping(value = "/image", produces = MediaType.APPLICATION_JSON_VALUE)
public class ImageController {

    ImageService imageService;

    @PostMapping(value = "save", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void save(MultipartRequest multipartFile) throws IOException {
        var image = multipartFile.getFiles("image").get(0);
        var name = image.getOriginalFilename();
        var bytes = image.getBytes();
        assert name != null;
        imageService.add(name, bytes);
    }

    @GetMapping(value = "/{imageId:.+}", produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] downloadFile(@PathVariable UUID imageId) {
        return imageService.getById(imageId).getImage();
    }
}

