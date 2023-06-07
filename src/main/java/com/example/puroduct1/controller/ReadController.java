package com.example.puroduct1.controller;

import com.example.puroduct1.service.ReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//readコントローラー
@Controller
//@RequestMappingを設定してクラス内のベースとなるURLを定義
@RequestMapping(value = "/read")
public class ReadController {

    //readサービス
    //readservice型のフィールドを定義する
    private final ReadService service;

    //@Autowiredを付与したコンストラクタを作成し、をDIする.これでReadServiceがReadController内で利用できるようになる
    @Autowired
    public ReadController(ReadService service){
        this.service = service;
    }


    //商品一覧初期表示
    @RequestMapping(value = "/init")
    public String init(){
        return "itemList";
    }

}
