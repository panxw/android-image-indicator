package com.app.library.common.view.sample;

import android.app.Activity;
import android.os.Bundle;

import com.app.library.common.view.ImageIndicatorView;
import com.app.library.common.view.R;

public class ScrollIndicateActivity extends Activity {
	private ImageIndicatorView scrollIndicateView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_indicator);

		this.scrollIndicateView = (ImageIndicatorView) findViewById(R.id.scroll_indicate_view);
		this.scrollIndicateView.setOnItemChangeListener(new ImageIndicatorView.OnItemChangeListener() {
			@Override
			public void onPosition(int position, int totalCount) {

			}
		});
		this.scrollIndicateView.setOnItemChangeListener(new ImageIndicatorView.OnItemChangeListener() {
			@Override
			public void onPosition(int position, int totalCount) {

			}
		});

		this.initView();
	}

	private void initView() {
		final Integer[] resArray = new Integer[] { R.drawable.ic_launcher, R.drawable.ic_launcher };
		this.scrollIndicateView.setupLayoutByDrawable(resArray);
		this.scrollIndicateView.setIndicateStyle(ImageIndicatorView.INDICATE_USERGUIDE_STYLE);
		this.scrollIndicateView.show();
	}
}
