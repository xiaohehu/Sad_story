package com.example.xiaohhu.uiwidgettest;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

// 如果用stestwitch语句要改这个activity的extends
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.exit_test);
        Button button = (Button) findViewById(R.id.button);
        imageView = (ImageView) findViewById(R.id.image_view);
        imageView.setTag(1);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // 此处添加逻辑
//            }
//        });
        button.setOnClickListener(this);
    }

    @Override
    public void onClick (View v) {
        switch (v.getId()){
            case R.id.button:
                // 此处添加逻辑
//                String inputText = editText.getText().toString();
//                Toast.makeText(MainActivity.this, inputText, Toast.LENGTH_SHORT).show();
//                imageView.setImageResource(R.drawable.image_2);
                if ((Integer)imageView.getTag() == 1) {
                    imageView.setTag(2);
                    imageView.setImageResource(R.drawable.image_2);
                } else {
                    imageView.setTag(1);
                    imageView.setImageResource(R.drawable.image_1);
                }
                break;
            default:
                break;
        }
    }
}
