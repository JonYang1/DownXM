package com.example.yang.downxm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    DownloadUtils downloadUtils;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //下载的地址
        downloadUtils =   new DownloadUtils(MainActivity.this);
        downloadUtils.downloadAPK("http://p.gdown.baidu.com/f842c58fa6f58cca45d5d0b3122b02e3b0b307d91755e709198ee16624be84ae5a9bf95daaefe26e18b86b4eb13730d36cc04ab58390af521f1bc5ded9fc080b29989bb807cc29df35d2ab2cfd09031c3b932451916e5e9f2245c42a96eeb39a616e3c7886fea24ffd5a00027b5f957d5acb329cde7257c16ed64bd3cd0db10accf30d61473e74481ade289e2d15babe3a48d34efdd7809d942d3c53fb4ff059219f5bc98baf3384c4043b31d4b7dcdc2093102d7e6c0d3e676c66334e3be75442120406c6d5e429bb66a7bcd372d82614a9873975aa2881cd9963bf38c5eb5c8e475ff09bf6e4972d833c4a7af9e686833e8518ab7f1683c2c8a5f7fd96072aa13660aba0be6f15", "XXX.apk");
    }
}
