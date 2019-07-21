object Deps {
    // versions
    const val compileSdk = 28
    const val targetSdk = 28
    const val minSdk = 15
    const val kotlinVersion = "1.3.41"
    const val buildTools = "28.0.3"

    // plugins
    const val androidGradlePlugin = "com.android.tools.build:gradle:3.5.0-rc01"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"

    // libs
    const val core = "androidx.core:core-ktx:1.0.2"
    const val appCompat = "androidx.appcompat:appcompat:1.0.2"
    const val junit = "junit:junit:4.12"
    const val testCore = "androidx.test:core:1.1.0"
    const val testRunner = "androidx.test:runner:1.1.0"
    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"
}