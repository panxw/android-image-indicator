android-image-indicator
=======================

An android image indicator for user guide or auto broadcast effect.

Style 1:
place in your layout:

    <com.app.library.common.view.ImageIndicatorView
        android:id="@+id/indicate_view"
        android:layout_width="match_parent"
        android:layout_height="160dp" />
        
set ImageIndicatorView as:

      imageIndicatorView = (ImageIndicatorView) findViewById(R.id.indicate_view);
      final Integer[] resArray = new Integer[] { R.drawable.ic_launcher, R.drawable.ic_launcher };
      imageIndicatorView.setupLayoutByDrawable(resArray);
      imageIndicatorView.show();

Style2:
place in your layout:

    <com.app.library.common.view.AutoImageIndicatorView
        android:id="@+id/auto_indicate_view"
        android:layout_width="match_parent"
        android:layout_height="160dp" />
        
set AutoImageIndicatorView as:

    autoImageIndicatorView = (AutoImageIndicatorView) findViewById(R.id.auto_indicate_view);
    final Integer[] resArray = new Integer[] { R.drawable.ic_launcher, R.drawable.ic_launcher };
    autoImageIndicatorView.setBroadcastEnable(true);
    autoImageIndicatorView.setBroadCastTimes(5);//循环播放5次
    autoImageIndicatorView.setBroadcastTimeIntevel(2 * 1000, 3 * 1000);//播放启动时间及间隔
    autoImageIndicatorView.setupLayoutByDrawable(resArray);//图片
    autoImageIndicatorView.show();

Style3:
place in your layout:

    <com.app.library.common.view.ImageIndicatorView
        android:id="@+id/guide_indicate_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
        
set ImageIndicatorView as:

    this.imageIndicatorView = (ImageIndicatorView) findViewById(R.id.guide_indicate_view);
    final Integer[] resArray = new Integer[] { R.drawable.ic_launcher, R.drawable.ic_launcher };
    imageIndicatorView.setupLayoutByDrawable(resArray);
    imageIndicatorView.setIndicateStyle(ImageIndicatorView.INDICATE_USERGUIDE_STYLE);
    imageIndicatorView.show();
