package com.example.puroduct1.service;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

//readサービス
@Service
public class ReadService {
    //表示用日付を取得。このメゾットではフォーマットした日付を文字列で返すので。戻り値はstring
    public String getDisplayDate(){
        //システム日付を取得
        Date date = new Date();

        //yyyy年mm月dd日の形式に変換
        //yyyy年mm月dd日の形式に日付をフォーマットするため、SimpleDateFormatを作成します
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern: "yyyy年mm月dd日")
        String displayDate = simpleDateFormat.format(date);

        //formatメソッドでフォーマットした日付を取得し、returnする
        return displayDate;


    }

}
