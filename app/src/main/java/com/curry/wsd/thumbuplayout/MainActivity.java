package com.curry.wsd.thumbuplayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.curry.wsd.thumbuplayout.view.ThumbUpLayout;

public class MainActivity extends AppCompatActivity {

    private ThumbUpLayout thumbUpLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        thumbUpLayout= (ThumbUpLayout) findViewById(R.id.thumbUpLayout);
    }

    public void OnClick(View v){
        switch (v.getId()){
            case R.id.iv:
                thumbUpLayout.addHeart();

                break;
        }
    }
}
