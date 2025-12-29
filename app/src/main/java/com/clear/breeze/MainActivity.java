package com.clear.breeze;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // 声明页面控件
    private TextView tvPoemContent;
    private TextView tvNoteContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 绑定控件
        tvPoemContent = findViewById(R.id.tv_poem_content);

        // 获取诗词数据（预留扩展接口，后续可替换为网络请求/加密数据等）
        String poemContent = "夜饮东坡醒复醉，归来仿佛三更。\n" +
                "家童鼻息已雷鸣。\n" +
                "敲门都不应，倚杖听江声。\n\n" +
                "长恨此身非我有，何时忘却营营。\n" +
                "夜阑风静縠纹平。\n" +
                "小舟从此逝，江海寄余生。";

        // 将数据填充到页面
        tvPoemContent.setText(poemContent);
    }
}


