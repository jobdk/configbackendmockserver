package com.example.configbackendmockserver.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


@RequestMapping("config_backend")
@RestController()
public class StubController {

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("apisettings")
    public String getApiSetting() throws IOException {
        File jsonFile = new File("../configbackendmockserver/src/main/resources/apisettings.json");

        return new String(Files.readAllBytes(jsonFile.toPath()));
    }
}
