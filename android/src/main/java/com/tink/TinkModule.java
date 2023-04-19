package com.tink;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.tooling.preview.Preview;
import com.tink.link.core.base.Tink;
import com.tink.link.core.data.request.accountcheck.AccountCheckCreateReport;
import com.tink.link.core.data.request.common.Market;
import com.tink.link.core.data.request.configuration.Configuration;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@ReactModule(name = TinkModule.NAME)
public class TinkModule extends ReactContextBaseJavaModule {
  public static final String NAME = "Tink";


  public TinkModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  @NonNull
  public String getName() {
    return NAME;
  }
  public Configuration configuration = new Configuration(
    "{YOUR_CLIENT_ID}",
    "{YOUR_REDIRECT_URI}"
  );


  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  @ReactMethod
  public void multiply(double a, double b, Promise promise) {
    promise.resolve(a * b);
  }
  @ReactMethod
  public void myFirstMethod(String firstParameter) {
    // Put here all the native code that you want to execute using this method
  }
  @ReactMethod
  public void mySecondMethod(String firstParameter, Promise promise) {
    promise.resolve(firstParameter);

    // Put here all the native code that you want to execute using this method
    // You can add a callback parameter if you're planning to execute any asynchronous call and want to enforce
   // RN layer to wait until the end
    // or if you want  to return anything to RN layer at the end   }
  }

}
