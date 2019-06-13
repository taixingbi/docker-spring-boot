package com.techprimers.docker.dockerspringboot.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class HelloResource {
    @RequestMapping
    public String hello(){

        return "this is simple test for spring boot";

    }

}
