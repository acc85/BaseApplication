plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("kotlin-android-extensions")

}

android {
    compileSdkVersion(Versions.compileSdk)
    defaultConfig {
        minSdkVersion(Versions.minSdk)
        targetSdkVersion(Versions.targetSdk)
        versionCode = Versions.versionCode
        versionName = Versions.versionName
        testInstrumentationRunner = AndroidXLibraries.testInstrumentationRunner
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

}

dependencies {
    implementation (fileTree (mapOf("dir" to "libs", "include" to listOf(".jar"))))

    api(ExternalLibraries.retrofit)
    api(ExternalLibraries.retrofitGSON)

    implementation(ExternalLibraries.dagger)
    implementation(ExternalLibraries.daggerAndroid)
    implementation(ExternalLibraries.daggerAndroidSupport) // if you use the support libraries
    implementation(AndroidXLibraries.roomCoroutines)
    implementation(AndroidXLibraries.roomCommon)
    implementation(AndroidXLibraries.roomRuntime)

    annotationProcessor(AndroidXLibraries.roomCompiler)

    annotationProcessor(ExternalLibraries.daggerCompiler)
    annotationProcessor(ExternalLibraries.daggerAndroidProcessor)

    implementation(KotlinDependencies.coroutines)
    implementation(ExternalLibraries.retrofitCoroutines)

    kapt(AndroidXLibraries.roomCompiler)
    kapt(ExternalLibraries.daggerCompiler)
    kapt(ExternalLibraries.daggerAndroidProcessor)

    testImplementation (TestLibraries.junit)
    androidTestImplementation (AndroidXLibraries.testRunner)
    androidTestImplementation (AndroidXLibraries.espresso)

    implementation(AndroidXLibraries.appcompat)
}

