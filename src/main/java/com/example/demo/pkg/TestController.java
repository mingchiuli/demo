package com.example.demo.pkg;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class TestController {

    @GetMapping("/test")
    public void test(@Anno Pojo pojo) {
        System.out.println("test");
    }
}
