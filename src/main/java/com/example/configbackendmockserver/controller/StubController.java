package com.example.configbackendmockserver.controller;

import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


@RequestMapping("config_backend")
@RestController()
public class StubController {

    private File jsonFile = new File("../configbackendmockserver/src/main/resources/apisettings.json");


    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("apisettings")
    public String getApiSetting() throws IOException {

        return new String(Files.readAllBytes(this.jsonFile.toPath()));
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("update")
    public String updateApiSetting(@RequestBody String apiSettings) {
        return apiSettings;
    }
}
