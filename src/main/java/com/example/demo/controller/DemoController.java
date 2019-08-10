package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lvpin
 * @date 2019/8/10 12:19
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @RequestMapping("/demo")
    public Object demo() {
        return "demo";
    }
}
