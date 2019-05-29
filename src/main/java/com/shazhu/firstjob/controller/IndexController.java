package com.shazhu.firstjob.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dongdong.fdd
 * @date 2019-05-29 22:52
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "hello world";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }
}
