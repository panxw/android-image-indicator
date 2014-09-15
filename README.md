android-image-indicator
=======================

Android image indicator for user guide or auto broadcast effect.

Style 1:
----------------------
layout:

	<com.allthelucky.common.view.ImageIndicatorView
	android:id="@+id/indicate_view"
	android:layout_width="match_parent"
	android:layout_height="160dp" />
        
set ImageIndicatorView as:

	imageIndicatorView = (ImageIndicatorView) findViewById(R.id.auto_indicate_view);
	final Integer[] resArray = new Integer[] { R.drawable.ic_launcher, R.drawable.ic_launcher };
	imageIndicatorView.setupLayoutByDrawable(resArray);//图片
	imageIndicatorView.setIndicateStyle(ImageIndicatorView.INDICATE_ARROW_ROUND_STYLE);
	imageIndicatorView.show();

	AutoPlayManager autoBrocastManager =  new AutoPlayManager(this.imageIndicatorView);
	autoBrocastManager.setBroadcastEnable(true);
	autoBrocastManager.setBroadCastTimes(5);//循环次数
	autoBrocastManager.setBroadcastTimeIntevel(3 * 1000, 3 * 1000);//首次启动时间及间隔
	autoBrocastManager.loop();

![ScreenShot](https://raw.github.com/winfirm/android-image-indicator/master/AndroidImageIndicatorSample/screenshot/poster0.jpg)

Style2(user guide mode):

	<com.allthelucky.common.view.ImageIndicatorView
	android:id="@+id/guide_indicate_view"
	android:layout_width="match_parent"
	android:layout_height="match_parent" />
        
set ImageIndicatorView as:

	this.imageIndicatorView = (ImageIndicatorView) findViewById(R.id.guide_indicate_view);
	final Integer[] resArray = new Integer[] { R.drawable.ic_launcher, R.drawable.ic_launcher };
	imageIndicatorView.setupLayoutByDrawable(resArray);
	imageIndicatorView.setIndicateStyle(ImageIndicatorView.INDICATE_USERGUIDE_STYLE);
	imageIndicatorView.show();

![ScreenShot](https://raw.github.com/winfirm/android-image-indicator/master/AndroidImageIndicatorSample/screenshot/guider_00.jpg)  
![ScreenShot](https://raw.github.com/winfirm/android-image-indicator/master/AndroidImageIndicatorSample/screenshot/guider_01.jpg)

