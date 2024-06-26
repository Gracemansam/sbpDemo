package com.kenpb.sample_plugin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample-plugin")
public class SamplePluginController {

    @GetMapping
    public String hello() {
        return "hello from plugin";
    }

    @GetMapping("/greet")
    public String greet() {
        return "greet from plugin, I am a sample plugin";
    }

}
