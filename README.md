android-image-indicator
=======================

Android image indicator for advertise and user guide(network image support).

####1、Advertise mode(auto play if need)
in layout file：

	<com.allthelucky.common.view.ImageIndicatorView
	android:id="@+id/indicate_view"
	android:layout_width="match_parent"
	android:layout_height="160dp" />
        
in java setting：

	imageIndicatorView = (ImageIndicatorView) findViewById(R.id.indicate_view);
	final Integer[] resArray = new Integer[] { R.drawable.ic_launcher, R.drawable.ic_launcher };
	imageIndicatorView.setupLayoutByDrawable(resArray);
	imageIndicatorView.setIndicateStyle(ImageIndicatorView.INDICATE_ARROW_ROUND_STYLE);
	imageIndicatorView.show();

set auto play if need：

	AutoPlayManager autoBrocastManager =  new AutoPlayManager(imageIndicatorView);
	autoBrocastManager.setBroadcastEnable(true);
	autoBrocastManager.setBroadCastTimes(5);//loop times
	autoBrocastManager.setBroadcastTimeIntevel(3 * 1000, 3 * 1000);//set first play time and interval
	autoBrocastManager.loop();

![ScreenShot](https://raw.github.com/panxw/android-image-indicator/master/AndroidImageIndicatorSample/screenshot/poster0.jpg)

####2、User guide mode

	this.imageIndicatorView = (ImageIndicatorView) findViewById(R.id.guide_indicate_view);
	final Integer[] resArray = new Integer[] { R.drawable.ic_launcher, R.drawable.ic_launcher };
	imageIndicatorView.setupLayoutByDrawable(resArray);
	imageIndicatorView.setIndicateStyle(ImageIndicatorView.INDICATE_USERGUIDE_STYLE);
	imageIndicatorView.show();

![ScreenShot](https://raw.github.com/panxw/android-image-indicator/master/AndroidImageIndicatorSample/screenshot/guider_00.jpg)  
![ScreenShot](https://raw.github.com/panxw/android-image-indicator/master/AndroidImageIndicatorSample/screenshot/guider_01.jpg)

####3、NetworkImageIndicatorView(image from network)

layout file：

	<com.allthelucky.common.view.network.NetworkImageIndicatorView
	android:id="@+id/network_indicate_view"
	android:layout_width="match_parent"
	android:layout_height="160dp" />

in java setting：

	final List<String> urlList= new ArrayList<String>();
	urlList.add("https://github.com/panxw/android-image-indicator/blob/master/AndroidImageIndicatorSample/screenshot/guider_00.jpg");
	urlList.add("https://github.com/panxw/android-image-indicator/blob/master/AndroidImageIndicatorSample/screenshot/guider_01.jpg");
	imageIndicatorView = (ImageIndicatorView) findViewById(R.id.network_indicate_view);
	imageIndicatorView.setupLayoutByImageUrl(urlList);
	imageIndicatorView.show();

set auto play if need：

	AutoPlayManager autoBrocastManager =  new AutoPlayManager(imageIndicatorView);
	autoBrocastManager.setBroadcastEnable(true);
	autoBrocastManager.setBroadCastTimes(5);//loop times
	autoBrocastManager.setBroadcastTimeIntevel(3 * 1000, 3 * 1000);//set first play time and interval
	autoBrocastManager.loop();

NetworkImageIndicatorView need network support, please view AndroidImageIndicatorSample first.

####Third party library
Android Volley Manager(base on official Volley): <https://github.com/panxw/android-volley-manager>

