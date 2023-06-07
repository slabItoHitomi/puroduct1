package com.example.puroduct1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//readコントローラー
@Controller
//@RequestMappingを設定してクラス内のベースとなるURLを定義
@RequestMapping(value = "/read")
public class ReadController {

    //商品一覧初期表示
    @RequestMapping(value = "/init")
    public String init(){
        return "itemList";
    }

}
