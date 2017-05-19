package com.git.nzy.dome01;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.git.nzy.dome01.activity.Activity_01;
import com.git.nzy.dome01.activity.Activity_02;
import com.git.nzy.dome01.activity.Activity_03;
import com.git.nzy.dome01.activity.Activity_04;
import com.git.nzy.dome01.activity.Activity_05;
import com.git.nzy.dome01.activity.Activity_06;
import com.git.nzy.dome01.activity.Activity_07;
import com.git.nzy.dome01.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity  extends BaseActivity {
    private ListView lv;
    List<String> list=new ArrayList<>();
    List<Activity> list1=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolBar("学习总结汇总",false);
        ddd();
        lv= (ListView) findViewById(R.id.lv);
        myAdapter ada=new myAdapter();
        lv.setAdapter(ada);
    }

    private void ddd() {
        initData("CoordinatorLayout布局",new Activity_01());
        initData("CoordinatorLayout布局",new Activity_02());
        initData("二维码",new Activity_03());
        initData("签字",new Activity_04());
        initData("悬浮窗",new Activity_05());
        initData("时间轮滚选择器",new Activity_06());
        initData("转扬方式",new Activity_07());
        initData("悬浮窗",new Activity_05());
        initData("悬浮窗",new Activity_05());

    }

    private void initData(String s,Activity a) {
        list1.add(a);
        list.add(s);
    }
    class myAdapter extends BaseAdapter {
        private LayoutInflater inflater;//布局填充器
        public myAdapter(){
            inflater=(LayoutInflater)MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int i) {
            return list.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(final int i, View view, ViewGroup viewGroup) {
            if(view==null){//
                view=inflater.inflate(R.layout.lv_item,null);
            }
            Button bt= (Button) view.findViewById(R.id.btn);
            bt.setText(list.get(i));
            bt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(MainActivity.this,list1.get(i).getClass()).putExtra("string",list.get(i)));
                }
            });
            return view;
        }
    }
}
