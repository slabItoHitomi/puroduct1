package com.example.puroduct1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//topコントローラー
@Controller
 public class TopController {

    //Top表示
    @RequestMapping("/")
    public String top(){

        return "top";
    }
}
