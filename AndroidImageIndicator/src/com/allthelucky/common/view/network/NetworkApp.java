package com.allthelucky.common.view.network;

import com.android.http.RequestManager;
import com.android.volley.toolbox.ImageLoader;

import android.app.Application;

/**
 * @description NetworkApp
 * 
 * @author steven-pan
 * 
 */
public class NetworkApp extends Application {

	private static ImageLoader sImageLoader = null;

	private final NetworkImageCache imageCacheMap = new NetworkImageCache();

	public static ImageLoader getImageLoader() {
		return sImageLoader;
	}

	@Override
	public void onCreate() {
		super.onCreate();
		
		RequestManager.getInstance().init(NetworkApp.this);
		sImageLoader = new ImageLoader(RequestManager.getInstance()
				.getRequestQueue(), imageCacheMap);
	}

}
