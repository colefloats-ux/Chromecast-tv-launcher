plugins { id("com.android.application") }
android { namespace = "com.cole.tvlauncher"; compileSdk = 35
 defaultConfig { applicationId = "com.cole.tvlauncher"; minSdk = 26; targetSdk = 35; versionCode = 1; versionName = "0.1" } }
dependencies { implementation("androidx.media3:media3-exoplayer:1.5.1"); implementation("androidx.media3:media3-ui:1.5.1"); implementation("androidx.media3:media3-exoplayer-hls:1.5.1") }
