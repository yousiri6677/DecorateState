package cn.topyun.youfull.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/nav")
    public String toNav(){
        return "nav";
    }
}
