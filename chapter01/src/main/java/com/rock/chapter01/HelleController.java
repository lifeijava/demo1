package com.rock.chapter01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelleController {

    @RequestMapping("/home")
    public String home(){
        return "hello home";
    }

    @RequestMapping("/index")
    public String index(){
        return "hello index";
    }
}
