package com.example.puroduct1.controller;

import com.example.puroduct1.service.ReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    //modelは引数として設定することで使用できるようになる
    public String init(Model model){
        //表示日付取得
        String displayDate = this.service.getDisplayDate();
        //画面に値を渡すためにモデルのaddAttributeメソッドを使用
        //引数には値名と値を指定。今回はdisplayDateという名前で表示用日付を格納
        model.addAttribute("displayDate",displayDate);
        return "itemList";
    }

}
