package com.panxw.android.imageindicator.sample.network;

import android.app.Activity;
import android.os.Bundle;

import com.panxw.android.imageindicator.AutoPlayManager;
import com.panxw.android.imageindicator.ImageIndicatorView;
import com.panxw.android.imageindicator.sample.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by panxw on 2016/6/20.
 */
public class NetworkImageIndicatorActivity  extends Activity{

    private ImageIndicatorView mAutoImageIndicatorView;
    private AutoPlayManager mAutoPlayManager;
    private static final List<String> URL_LIST = new ArrayList<String>(){
        {
            add("https://raw.githubusercontent.com/panxw/android-image-indicator/master/sample/src/main/res/drawable/poster1.jpg");
            add("https://raw.githubusercontent.com/panxw/android-image-indicator/master/sample/src/main/res/drawable/poster2.jpg");
            add("https://raw.githubusercontent.com/panxw/android-image-indicator/master/sample/src/main/res/drawable/poster3.jpg");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indicator_network);

        this.mAutoImageIndicatorView = (ImageIndicatorView) findViewById(R.id.indicate_view);
        this.mAutoImageIndicatorView.setOnItemChangeListener(new ImageIndicatorView.OnItemChangeListener() {
            @Override
            public void onPosition(int position, int totalCount) {

            }
        });
        this.mAutoImageIndicatorView.setOnItemChangeListener(new ImageIndicatorView.OnItemChangeListener() {
            @Override
            public void onPosition(int position, int totalCount) {

            }
        });

        initView();
    }

    private void initView() {
        this.mAutoImageIndicatorView.setupLayoutByImageUrl(URL_LIST);
        this.mAutoImageIndicatorView.show();

        AutoPlayManager autoPlayManager = new AutoPlayManager(this.mAutoImageIndicatorView);
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
