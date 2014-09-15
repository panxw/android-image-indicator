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

		this.imageIndicatorView = (NetworkImageIndicatorView) findViewById(R.id.indicate_view);
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
		urlList.add("https://camo.githubusercontent.com/89e5d1cbd313c8611aaac6040fc4be873818ac12/68747470733a2f2f7261772e6769746875622e636f6d2f77696e6669726d2f616e64726f69642d696d6167652d696e64696361746f722f6d61737465722f416e64726f6964496d616765496e64696361746f722f73637265656e73686f742f6775696465725f30302e6a7067");
		urlList.add("https://camo.githubusercontent.com/929483245f2f66ad7a6fd3bb7396049780446199/68747470733a2f2f7261772e6769746875622e636f6d2f77696e6669726d2f616e64726f69642d696d6167652d696e64696361746f722f6d61737465722f416e64726f6964496d616765496e64696361746f722f73637265656e73686f742f6775696465725f30312e6a7067");
		
		this.imageIndicatorView.setupLayoutByImageUrl(urlList);
		this.imageIndicatorView.show();
	}
}
