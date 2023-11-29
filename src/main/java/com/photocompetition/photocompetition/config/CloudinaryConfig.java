package com.photocompetition.photocompetition.config;

import com.cloudinary.Cloudinary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class CloudinaryConfig {

    @Bean
    public Cloudinary getCloudinary(){
        Map config = new HashMap();
        config.put("cloud_name", "dzqpbfbn4");
        config.put("api_key", "878668128673164");
        config.put("api_secret", "hbkyTF21VZKUQkr50jrpX-Pj5cU");
        config.put("secure", true);
        return new Cloudinary(config);
    }
}
