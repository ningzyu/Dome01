package com.git.nzy.dome01.activity.a7_view;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;

import com.git.nzy.dome01.R;

/**
 * Created by chentian on 2017/5/11.
 */

public class A7_SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_layout);

        getWindow().setEnterTransition(new Fade().setDuration(2000));
        getWindow().setExitTransition(new Fade().setDuration(2000));

        //将状态栏透明
        if(Build.VERSION.SDK_INT>=21){
            View decorView = getWindow().getDecorView();
            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN|
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            decorView.setSystemUiVisibility(option);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }

//        TextView textView = (TextView) findViewById(R.id.content);
//        TranslateAnimation animation = new TranslateAnimation(0,0,200,0);
//        animation.setDuration(500);
//        textView.setAnimation(animation);
//        animation.start();
    }
}
