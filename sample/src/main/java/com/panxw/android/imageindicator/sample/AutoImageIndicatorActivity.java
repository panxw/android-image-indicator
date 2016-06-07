package com.panxw.android.imageindicator.sample;

import android.app.Activity;
import android.os.Bundle;

import com.panxw.android.imageindicator.AutoPlayManager;
import com.panxw.android.imageindicator.ImageIndicatorView;

public class AutoImageIndicatorActivity extends Activity {
    private ImageIndicatorView autoImageIndicatorView;
    private AutoPlayManager mAutoPlayManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indicator);

        this.autoImageIndicatorView = (ImageIndicatorView) findViewById(R.id.indicate_view);
        autoImageIndicatorView.setOnItemChangeListener(new ImageIndicatorView.OnItemChangeListener() {
            @Override
            public void onPosition(int position, int totalCount) {

            }
        });
        this.autoImageIndicatorView.setOnItemChangeListener(new ImageIndicatorView.OnItemChangeListener() {
            @Override
            public void onPosition(int position, int totalCount) {

            }
        });

        initView();
    }

    private void initView() {
        final Integer[] resArray = new Integer[]{R.drawable.poster1, R.drawable.poster2, R.drawable.poster3, R.drawable.poster2, R.drawable.poster1};

        this.autoImageIndicatorView.setupLayoutByDrawable(resArray);
        this.autoImageIndicatorView.show();

        AutoPlayManager autoPlayManager = new AutoPlayManager(this.autoImageIndicatorView);
        autoPlayManager.setBroadcastEnable(true);
        autoPlayManager.setBroadCastTimes(5);//循环次数
        autoPlayManager.setBroadcastTimeIntevel(3 * 1000, 3 * 1000);//首次启动时间及间隔
        autoPlayManager.loop();

        this.mAutoPlayManager = autoPlayManager;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (mAutoPlayManager != null) {
            mAutoPlayManager.stop();
        }
    }
    
}
