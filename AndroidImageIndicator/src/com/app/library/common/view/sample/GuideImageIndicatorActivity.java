package com.app.library.common.view.sample;

import android.app.Activity;
import android.os.Bundle;

import com.app.library.common.view.ImageIndicatorView;
import com.app.library.common.view.R;

public class GuideImageIndicatorActivity extends Activity {
	private ImageIndicatorView imageIndicatorView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_indicator_guide);

		this.imageIndicatorView = (ImageIndicatorView) findViewById(R.id.guide_indicate_view);
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
		final Integer[] resArray = new Integer[] { R.drawable.ic_launcher, R.drawable.ic_launcher };
		this.imageIndicatorView.setupLayoutByDrawable(resArray);
		this.imageIndicatorView.setIndicateStyle(ImageIndicatorView.INDICATE_USERGUIDE_STYLE);
		this.imageIndicatorView.show();
	}
}
