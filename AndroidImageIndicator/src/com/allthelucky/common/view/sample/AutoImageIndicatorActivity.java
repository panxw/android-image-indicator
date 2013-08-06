package com.allthelucky.common.view.sample;

import android.app.Activity;
import android.os.Bundle;

import com.allthelucky.common.view.AutoImageIndicatorView;
import com.allthelucky.common.view.ImageIndicatorView;
import com.app.library.common.view.R;

public class AutoImageIndicatorActivity extends Activity {
	private AutoImageIndicatorView autoImageIndicatorView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_indicator_auto);

		this.autoImageIndicatorView = (AutoImageIndicatorView) findViewById(R.id.auto_indicate_view);
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
		final Integer[] resArray = new Integer[] { R.drawable.poster1, R.drawable.poster2, R.drawable.poster3 };
		this.autoImageIndicatorView.setBroadcastEnable(true);
		this.autoImageIndicatorView.setBroadCastTimes(5);//循环播放5次
		this.autoImageIndicatorView.setBroadcastTimeIntevel(2 * 1000, 3 * 1000);//播放启动时间及间隔
		this.autoImageIndicatorView.setupLayoutByDrawable(resArray);//图片
		this.autoImageIndicatorView.show();
	}

}
