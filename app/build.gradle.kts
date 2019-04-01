plugins {
    id("com.android.application")
    id("kotlin-kapt")
    id("kotlin-android")
    id("kotlin-android-extensions")
}


android {
    compileSdkVersion(Versions.compileSdk)
    defaultConfig {
        applicationId = "com.rayt.baseapplication"
        minSdkVersion (Versions.minSdk)
        targetSdkVersion (Versions.targetSdk)
        versionCode = Versions.versionCode
        versionName = Versions.versionName
        testInstrumentationRunner = AndroidXLibraries.testInstrumentationRunner
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled =false
            proguardFiles (getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    dataBinding {
        isEnabled = true
    }
}

dependencies {
    implementation (fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation (KotlinDependencies.kotlinStandardLibrary)
    implementation (AndroidXLibraries.appcompat)

    implementation (AndroidXLibraries.constraintLayout)

    implementation(AndroidXLibraries.lifecycleExtensions)

    implementation (ExternalLibraries.dagger)
    implementation (ExternalLibraries.daggerAndroid)
    implementation (ExternalLibraries.daggerAndroidSupport) // if you use the support libraries

    annotationProcessor (ExternalLibraries.daggerAndroidProcessor)
    annotationProcessor (ExternalLibraries.daggerCompiler)


    kapt (AndroidXLibraries.lifecycleCompiler)

    kapt (ExternalLibraries.daggerCompiler)
    kapt (ExternalLibraries.daggerAndroidProcessor)

    implementation (KotlinDependencies.coroutinesAndroid)
    implementation (KotlinDependencies.coroutines)

    implementation (project(":repository"))
    testImplementation (TestLibraries.junit)
    androidTestImplementation (AndroidXLibraries.testRunner)
    androidTestImplementation (AndroidXLibraries.espresso)

}
