package com.allthelucky.common.view.sample;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;

import com.allthelucky.common.view.ImageIndicatorView;
import com.allthelucky.common.view.network.NetworkImageIndicatorView;

public class NetworkImageIndicatorActivity extends Activity {
	private NetworkImageIndicatorView imageIndicatorView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_indicator_network);

		this.imageIndicatorView = (NetworkImageIndicatorView) findViewById(R.id.network_indicate_view);
		this.imageIndicatorView.setOnItemChangeListener(new ImageIndicatorView.OnItemChangeListener() {
			@Override
			public void onPosition(int position, int totalCount) {

			}
		});
		this.imageIndicatorView.setOnItemChangeListener(new ImageIndicatorView.OnItemChangeListener() {
			@Override
			public void onPosition(int position, int totalCount) {

			}
		});

		this.initView();
	}

	private void initView() {
		List<String> urlList= new ArrayList<String>();
		urlList.add("https://github.com/winfirm/android-image-indicator/blob/master/AndroidImageIndicatorSample/screenshot/guider_00.jpg");
		urlList.add("https://github.com/winfirm/android-image-indicator/blob/master/AndroidImageIndicatorSample/screenshot/guider_01.jpg");
		
		this.imageIndicatorView.setupLayoutByImageUrl(urlList);
		this.imageIndicatorView.show();
	}
}
