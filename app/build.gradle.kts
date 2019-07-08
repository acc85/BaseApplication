plugins {
    id(Plugins.androidApplication)
    kotlin(Plugins.kotlinAndroid)
    kotlin(Plugins.kotlinKspt)
    kotlin(Plugins.kotlinAndroidExtensions)
}

android {
    compileSdkVersion(Versions.compileSdk)
    defaultConfig {
        applicationId = Application.id
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    dataBinding {
        isEnabled = true
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(KotlinDependencies.kotlinStandardLibrary)
    implementation(AndroidXLibraries.appcompat)
    implementation(AndroidXLibraries.constraintLayout)
    implementation(AndroidXLibraries.recyclerview)

    implementation(AndroidXLibraries.lifecycleExtensions)

    implementation(ExternalLibraries.dagger)
    implementation(ExternalLibraries.daggerAndroid)
    implementation(ExternalLibraries.daggerAndroidSupport) // if you use the support libraries
    annotationProcessor(ExternalLibraries.daggerAndroidProcessor)
    annotationProcessor(ExternalLibraries.daggerCompiler)


    kapt(AndroidXLibraries.lifecycleCompiler)

    kapt(ExternalLibraries.daggerCompiler)
    kapt(ExternalLibraries.daggerAndroidProcessor)

    implementation(KotlinDependencies.coroutinesAndroid)
    implementation(KotlinDependencies.coroutines)

    implementation(project(Modules.repository))
    implementation(project(Modules.models))
    implementation(project(Modules.resources))
    implementation(project(Modules.utilities))

    testImplementation(TestLibraries.junit)
    androidTestImplementation(AndroidXLibraries.testRunner)
    androidTestImplementation(AndroidXLibraries.espresso)

}
