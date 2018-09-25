package com.panxw.android.imageindicator.sample;


import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * SampleApp
 * 
 * @author steven-pan
 * 
 */
public class SampleApp extends Application {
	@Override
	public void onCreate() {
		super.onCreate();

		//Initialize ImageLoader with configuration.
		ImageLoaderConfiguration configuration = ImageLoaderConfiguration
				.createDefault(this);
		ImageLoader.getInstance().init(configuration);
	}

}
