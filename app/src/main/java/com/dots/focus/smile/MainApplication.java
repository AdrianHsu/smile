package com.dots.focus.smile;

import android.app.Application;
import com.flurry.android.FlurryAgent;

/**
 * Created by AdrianHsu on 2016/4/1.
 */
public class MainApplication extends Application {

  private static String FLURRY_KEY = "T9Q4JZRT73QXNDY4NNB4";
  @Override
  public void onCreate() {
    super.onCreate();
    FlurryAgent.init(this, FLURRY_KEY);

  }
}
