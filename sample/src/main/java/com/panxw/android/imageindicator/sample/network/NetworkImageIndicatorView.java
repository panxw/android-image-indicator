package com.panxw.android.imageindicator.sample.network;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.panxw.android.imageindicator.ImageIndicatorView;

import java.util.List;

/**
 * Created by panxw on 2016/6/20.
 */
public class NetworkImageIndicatorView extends ImageIndicatorView {
    private DisplayImageOptions mDisplayImageOptions = new DisplayImageOptions.Builder()
            .cacheOnDisk(true).build();

    public NetworkImageIndicatorView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NetworkImageIndicatorView(Context context) {
        super(context);
    }

    /**
     * set image url list
     */
    @Override
    public void setupLayoutByImageUrl(List<String> urlList) {
        for (String url : urlList) {
            ImageView imageView = new ImageView(getContext());
            ImageLoader.getInstance().displayImage(url, imageView, mDisplayImageOptions);
            addViewItem(imageView);
        }
    }

}
