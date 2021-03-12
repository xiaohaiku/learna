package com.example.learnboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangYanHai
 * @className: LoginController
 * @description:
 * @createDate 2021/3/12 13:59
 */
@RestController
public class LoginController {

    @RequestMapping("hello")
    public String hello(){
        return "hello you";
    }
}
