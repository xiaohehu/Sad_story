package com.example.xiaohhu.uilayouttest;

import android.app.Activity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.content.Context;
import android.widget.Toast;

/**
 * Created by xiaohehu on 3/4/18.
 */

public class TitleLayout extends LinearLayout{
    public TitleLayout (Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context). inflate(R.layout.title, this);
        Button titleBack = (Button) findViewById(R.id.title_back);
        Button titleEdit = (Button) findViewById(R.id.title_edit);
        titleBack.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity) getContext()).finish();
            }
        });

        titleEdit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "You clicked Edit button", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
