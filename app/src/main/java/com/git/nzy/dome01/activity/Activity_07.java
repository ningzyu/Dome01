package com.git.nzy.dome01.activity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;

import com.git.nzy.dome01.R;
import com.git.nzy.dome01.activity.a7_view.A7_SecondActivity;

public class Activity_07 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_07);
        //将状态栏透明
        if(Build.VERSION.SDK_INT>=21){
            View decorView = getWindow().getDecorView();
            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN|
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            decorView.setSystemUiVisibility(option);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
}

    public void share(View view) {
        Intent intent = new Intent(this,A7_SecondActivity.class);
//        ImageView image = (ImageView) findViewById(R.id.image);
//        TextView text = (TextView) findViewById(R.id.text);
//        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this,
//                Pair.create((View)image,"myImage"),Pair.create((View)text,"myText")).toBundle());

        startActivity(new Intent(this, A7_SecondActivity.class), ActivityOptions.makeSceneTransitionAnimation(this).toBundle());

    }
}
