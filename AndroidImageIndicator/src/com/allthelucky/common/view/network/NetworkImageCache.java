package com.allthelucky.common.view.network;

import com.android.volley.toolbox.ImageLoader.ImageCache;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;

/**
 * @description NetworkImageCache
 * 
 * @auther steven-pan
 */
public class NetworkImageCache extends LruCache<String, Bitmap> implements
		ImageCache {

	public NetworkImageCache() {
		this(getDefaultLruCacheSize());
	}

	public NetworkImageCache(int sizeInKiloBytes) {
		super(sizeInKiloBytes);
	}

	@Override
	protected int sizeOf(String key, Bitmap value) {
		return value.getRowBytes() * value.getHeight() / 1024;
	}

	@Override
	public Bitmap getBitmap(String url) {
		return get(url);
	}

	@Override
	public void putBitmap(String url, Bitmap bitmap) {
		put(url, bitmap);
	}

	public static int getDefaultLruCacheSize() {
		final int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);
		final int cacheSize = maxMemory / 8;
		return cacheSize;
	}
}
