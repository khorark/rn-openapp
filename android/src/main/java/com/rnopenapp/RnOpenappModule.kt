package com.rnopenapp

import android.content.pm.PackageManager
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class RnOpenappModule(reactContext: ReactApplicationContext) :
  ReactContextBaseJavaModule(reactContext) {

  override fun getName(): String {
    return NAME
  }

  @ReactMethod
  fun openApp(packageId: String, promise: Promise) {
    val packageManager: PackageManager = getReactApplicationContext().getPackageManager()
    try {
      val launchIntent: Intent = packageManager.getLaunchIntentForPackage(packageId)
      getReactApplicationContext().startActivity(launchIntent)
      promise.resolve(true)
    } catch (e: Exception) {
      promise.reject(e.message, "Package not found")
    }
  }

  companion object {
    const val NAME = "RnOpenapp"
  }
}
