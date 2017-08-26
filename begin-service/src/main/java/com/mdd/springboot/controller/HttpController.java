package com.mdd.springboot.controller;

import com.mdd.service.httpService.HttpClientService;
import com.mdd.service.httpService.HttpUrlConnectionService;
import com.mdd.service.httpService.SocketService;
import com.mdd.service.httpService.UrlConnectitonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by madongdong on 2017/8/26.
 */
@RestController
public class HttpController {
    @Autowired
    private HttpUrlConnectionService httpUrlConnectionService;

    @Autowired
    private UrlConnectitonService urlConnectitonService;

    @Autowired
    private HttpClientService httpClientService;

    @Autowired
    private SocketService socketService;

    @RequestMapping("/http/index")
    public String index(){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("name","马冬冬");
        /*String str = urlConnectitonService.sendPost("http://127.0.0.1:8081",map,"utf-8");*/
        /*String str = httpClientService.httpClientPost("http://127.0.0.1:8081",map,"utf-8");*/
        String str = socketService.sendSocketGetSimple("http://127.0.0.1:8082",map,"utf-8");
        System.out.println(str);
        return str;
    }
}
