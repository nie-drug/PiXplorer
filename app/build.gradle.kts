plugins {
    id("com.android.application")
}

android {
    compileSdkVersion(32)
    defaultConfig {
        applicationId = "com.projectmaterial.myapplication"
        minSdkVersion(23)
        targetSdkVersion(32)
        versionCode = 1
        versionName = "1.0.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    namespace = "com.projectmaterial.myapplication"
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.5.1")
    implementation("com.google.android.material:material:1.7.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.preference:preference:1.2.0")
}
