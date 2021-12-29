package com.bear.bearcommunity.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @title: HelloController
 * @Author HanMingHao
 * @Date: 2021/12/28 17:04
 * @Version 1.0
 */

@RestController
public class HelloController {

    @RequestMapping("/Start")
    public String hello(){
        return "Start";
    }
}

