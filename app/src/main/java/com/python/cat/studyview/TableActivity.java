package com.python.cat.studyview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.apkfuns.logutils.LogUtils;
import com.python.cat.studyview.base.BaseActivity;

/**
 * 图表界面(for: luo wei di)
 */
public class TableActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        findViewById(R.id.btn_next)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        LogUtils.w("next...");
                        startActivity(new Intent(getActivity(), RoundActivity.class));
                    }
                });
    }
}