package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;

public class OpenappModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public OpenappModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "Openapp";
    }

    @ReactMethod
    public void openApp(String packageId, Promise promise) {
        try {
            Intent launchIntent = packageManager.getLaunchIntentForPackage(packageId);
            getReactApplicationContext().startActivity(launchIntent);
            promise.resolve(true);
        } catch (Exception e) {
            promise.reject(e.getMessage(), "Package not found");
        }
    }
}
