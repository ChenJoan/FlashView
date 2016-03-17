package com.general.android.flashviewdemo;

import android.app.Activity;

import android.os.Bundle;

import com.gc.flashview.FlashView;
import com.gc.flashview.constants.EffectConstants;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private FlashView flashView;
    private ArrayList<String> imageUrls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flashView = (FlashView) findViewById(R.id.flash_view);
        imageUrls = new ArrayList<String>();

//        imageUrls.add("http://image.baidu.com/search/detail?ct=503316480&tn=baiduimagedetail&statnum=wallpaper&ipn=d&z=0&s=0&ic=0&lm=-1&itg=0&cg=wallpaper&word=%E5%A3%81%E7%BA%B8&ie=utf-8&in=3354&cl=2&st=&pn=0&rn=1&di=0&ln=1000&&fmq=1378374347070_R&se=&sme=0&tab=&face=&&cs=1271743327,1430666038&adpicid=0&pi=0&os=2691782811,855557015&istype=&ist=&jit=&objurl=http%3A%2F%2Fa.ikafan.com%2Fattachment%2Fforum%2Fmonth_0807%2F20080726_877668de4f27856575b3y1PzoiAhYveb.jpg&bdtype=-1&gsm=200003c");
        imageUrls.add("http://www.juzi2.com/uploads/allimg/130619/1_130619193218_1.jpg");
        imageUrls.add("http://a.hiphotos.baidu.com/zhidao/pic/item/4034970a304e251f4dd80e61a786c9177f3e5378.jpg");
        imageUrls.add("http://f.hiphotos.baidu.com/zhidao/pic/item/9e3df8dcd100baa12801ad224710b912c8fc2e7e.jpg");
//                imageUrls.add("http://www.kole8.com/desktop/desk_file-11/2/2/2012/11/2012113013552959.jpg");
//        imageUrls.add("http://www.237.cc/uploads/pcline/712_0_1680x1050.jpg");
        flashView.setImageUris(imageUrls);
        flashView.setEffect(EffectConstants.CUBE_EFFECT);//更改图片切换的动画效果
    }
}
