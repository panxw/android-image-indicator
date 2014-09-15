package com.allthelucky.common.view.sample;

import android.app.Activity;
import android.os.Bundle;

import com.allthelucky.common.view.AutoPlayManager;
import com.allthelucky.common.view.ImageIndicatorView;
import com.app.library.common.view.R;

public class AutoImageIndicatorActivity extends Activity {
	private ImageIndicatorView autoImageIndicatorView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_indicator_auto);

		this.autoImageIndicatorView = (ImageIndicatorView) findViewById(R.id.auto_indicate_view);
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
		
		this.autoImageIndicatorView.setupLayoutByDrawable(resArray);//图片
		this.autoImageIndicatorView.show();
		
		AutoPlayManager autoBrocastManager =  new AutoPlayManager(this.autoImageIndicatorView);
		autoBrocastManager.setBroadcastEnable(true);
		autoBrocastManager.setBroadCastTimes(5);//循环播放5次
		autoBrocastManager.setBroadcastTimeIntevel(5 * 1000, 3 * 1000);//播放启动时间及间隔
		autoBrocastManager.loop();
		
	}

}
