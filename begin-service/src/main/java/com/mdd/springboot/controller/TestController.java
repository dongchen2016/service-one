package com.mdd.springboot.controller;


import com.mdd.service.httpService.HttpUrlConnectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by madongdong on 2017/8/24.
 */
@RestController
public class TestController {

    @Autowired
    private HttpUrlConnectionService httpUrlConnectionService;
    @RequestMapping("/test")
    public String index(){
        /*String str = httpUrlConnectionService.sendPost()*/
        return "123";
    }

}
