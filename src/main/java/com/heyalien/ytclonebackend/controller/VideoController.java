package com.heyalien.ytclonebackend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/videos")
public class VideoController {

    @GetMapping("/hello")
    public String hello() {
        return "Server up and running!!";
    }

}
