package com.allthelucky.common.view.sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.app.library.common.view.R;

public class SampleActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		findViewById(R.id.button1).setOnClickListener(this);
		findViewById(R.id.button2).setOnClickListener(this);
		findViewById(R.id.button3).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		final int resId = v.getId();
		if (resId == R.id.button1) {
			startActivity(new Intent(this, ImageIndicatorActivity.class));
		} else if (resId == R.id.button2) {
			startActivity(new Intent(this, AutoImageIndicatorActivity.class));
		} else if (resId == R.id.button3) {
			startActivity(new Intent(this, GuideImageIndicatorActivity.class));
		}
	}
}
