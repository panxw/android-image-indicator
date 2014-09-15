package com.allthelucky.common.view.sample;

import android.app.Activity;
import android.os.Bundle;

import com.allthelucky.common.view.ImageIndicatorView;

public class ImageIndicatorActivity extends Activity {
	private ImageIndicatorView imageIndicatorView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_indicator);

		this.imageIndicatorView = (ImageIndicatorView) findViewById(R.id.indicate_view);
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
		final Integer[] resArray = new Integer[] { R.drawable.poster1, R.drawable.poster2, R.drawable.poster3 };
		this.imageIndicatorView.setupLayoutByDrawable(resArray);
		this.imageIndicatorView.show();
	}
}
