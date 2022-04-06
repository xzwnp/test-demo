package com.example.testdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.example.testdemo
 *
 * @author xzwnp
 * 2022/4/6
 * 12:34
 * Steps：
 */
@RestController
@RequestMapping("api")
public class Controller {
    @GetMapping("hello")
    public String sayHello(){
        return "hello world";
    }
}
