object Versions {
    val kotlin = "1.3.21"
    val jetifierProcessor = "1.0.0-beta02"
    val gradleBuildTooslVersion = "3.3.2"
    val dagger_version = "2.15"
    val room_coroutine_version = "2.1.0-alpha04"
    val room_version = "2.1.0-alpha06"
    val ktx = "1.1.1"
    val coroutines = "1.0.0"
    val compileSdk = 28
    val minSdk = 21
    val targetSdk = 28
    val appcompat = "1.0.2"
    val design = "1.0.0"
    val cardview = "1.0.0"
    val recyclerview = "1.0.0"
    val maps = "15.0.1"
    val constraintLayout = "1.1.3"
    val retrofit = "2.5.0"
    val lifecycle = "2.0.0"
    val junit = "4.12"
    val test = "1.1.0-alpha4"
    val testRunner = "1.1.0-alpha4"
    val espresso = "3.1.0-alpha4"

    val versionCode = 1
    val versionName = "1.0"
}

object Application{
    val id = "com.rayt.baseapplication"

}

object Modules {
    val app = ":app"
    val repository = ":repository"
    val domain = ":domain"
    val models = ":models"
    val resources = ":resources"
    val utilities = ":utilities"


}

object KotlinDependencies {
    val kotlinStandardLibrary = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    val ktx = "androidx.core:core-ktx:${Versions.ktx}"
    val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.ktx}"
    val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
}

object BuildScriptClassPaths{
    val gradleBuildTools = "com.android.tools.build:gradle:${Versions.gradleBuildTooslVersion}"
    val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    val jettifierProcessor = "com.android.tools.build.jetifier:jetifier-processor:${Versions.jetifierProcessor}"
}

object AndroidXLibraries {
    val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    val design = "com.google.android.material:material:${Versions.design}"
    val cardview = "androidx.cardview:cardview:${Versions.cardview}"
    val recyclerview = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"
    val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"
    val testRunner = "androidx.test:runner:${Versions.testRunner}"
    val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    val roomCompiler = "androidx.room:room-compiler:${Versions.room_version}"
    val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    val roomCoroutines = "androidx.room:room-coroutines:${Versions.room_coroutine_version}"
    val roomRuntime = "androidx.room:room-runtime:${Versions.room_version}"
    val roomCommon = "androidx.room:room-common:${Versions.room_version}"
    val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

}

object ExternalLibraries {
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val retrofitGSON = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    val rxjavaAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    val retrofitCoroutines =
        "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-experimental-adapter:${Versions.coroutines}"
    val dagger = "com.google.dagger:dagger:${Versions.dagger_version}"
    val daggerAndroid = "com.google.dagger:dagger-android:${Versions.dagger_version}"
    val daggerAndroidSupport =
        "com.google.dagger:dagger-android-support:${Versions.dagger_version}" // if you use the support libraries

    val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger_version}"
    val daggerAndroidProcessor = "com.google.dagger:dagger-android-processor:${Versions.dagger_version}"
}

object Plugins{
    val androidApplication = "com.android.application"
    val androidLibrary = "com.android.library"
    val kotlinKspt = "kapt"
    val kotlinAndroid = "android"
    val kotlinAndroidExtensions = "android.extensions"
}

object TestLibraries {
    val junit = "junit:junit:${Versions.junit}"
}