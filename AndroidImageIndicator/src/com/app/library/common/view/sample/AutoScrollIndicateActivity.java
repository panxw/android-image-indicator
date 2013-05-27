package com.app.library.common.view.sample;

import com.app.library.common.view.AutoImageIndicatorView;
import com.app.library.common.view.ImageIndicatorView;
import com.example.androidimageindicator.R;

import android.app.Activity;
import android.os.Bundle;

public class AutoScrollIndicateActivity extends Activity {
	private AutoImageIndicatorView scrollIndicateView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_indicator_auto);

		scrollIndicateView = (AutoImageIndicatorView) findViewById(R.id.auto_scroll_indicate_view);
		scrollIndicateView.setOnItemChangeListener(new ImageIndicatorView.OnItemChangeListener() {
			@Override
			public void onPosition(int position, int totalCount) {

			}
		});
		scrollIndicateView.setOnItemChangeListener(new ImageIndicatorView.OnItemChangeListener() {
			@Override
			public void onPosition(int position, int totalCount) {

			}
		});
		
		initView();
	}

	private void initView() {
		final Integer[] resArray = new Integer[] { R.drawable.ic_launcher, R.drawable.ic_launcher };
		scrollIndicateView.setBroadcastEnable(true);
		scrollIndicateView.setBroadCastTimes(5);//循环播放5次
		scrollIndicateView.setBroadcastTimeIntevel(2 * 1000, 3 * 1000);//播放启动时间及间隔
		scrollIndicateView.setupLayoutByDrawable(resArray);//图片
		scrollIndicateView.show();
	}

}
