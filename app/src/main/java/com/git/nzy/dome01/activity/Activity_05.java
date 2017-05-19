package com.git.nzy.dome01.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.git.nzy.dome01.R;
import com.git.nzy.dome01.service.MyWinService2;
import com.git.nzy.dome01.service.MyWinService1;

/**
 * 悬浮窗
 */
public class Activity_05 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_05);
    }
    public void click(View v){
        Intent intent1=new Intent(this, MyWinService1.class);
        Intent intent2 = new Intent(this, MyWinService2.class);
        switch (v.getId()){
            case R.id.start_btn1:
                startService(intent1);
                break;
            case R.id.start_btn2:
                startService(intent2);
                break;
            case R.id.close_btn1:
                stopService(intent1);
                break;
            case R.id.close_btn2:
                stopService(intent2);
                break;
        }
    }
}
