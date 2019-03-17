plugins {
    id("com.android.application")
}

android {
    compileSdkVersion(Deps.compileSdk)
    defaultConfig {
        applicationId = "com.samelody.archer.sample"
        minSdkVersion(Deps.minSdk)
        targetSdkVersion(Deps.targetSdk)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Deps.appCompat)
    testImplementation(Deps.junit)
    androidTestImplementation(Deps.testCore)
}
