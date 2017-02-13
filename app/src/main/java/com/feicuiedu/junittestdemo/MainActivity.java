package com.feicuiedu.junittestdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.feicuiedu.junittestdemo.network.EasyShopClient;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.tvShow)
    TextView mTvShow;
    @Bind(R.id.btnShow)
    Button mBtnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btnShow)
    public void onClick() {

        String s = "Java";

        Call login = EasyShopClient.getInstance().login("123456", "123456");

        mTvShow.setText(s);
    }
}
