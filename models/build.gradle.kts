plugins {
    id(Plugins.androidLibrary)
    kotlin(Plugins.kotlinKspt)
    kotlin(Plugins.kotlinAndroid)
    kotlin(Plugins.kotlinAndroidExtensions)
}

android {
    compileSdkVersion (Versions.compileSdk)

    defaultConfig {
        minSdkVersion (Versions.minSdk)
        targetSdkVersion (Versions.targetSdk)
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

    dataBinding{
        isEnabled = true
    }

}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(ExternalLibraries.dagger)
    implementation(ExternalLibraries.daggerAndroid)
    implementation(ExternalLibraries.daggerAndroidSupport)

    kapt(ExternalLibraries.daggerCompiler)
    kapt(ExternalLibraries.daggerAndroidProcessor)

    annotationProcessor(ExternalLibraries.daggerCompiler)
    annotationProcessor(AndroidXLibraries.roomCompiler)
    annotationProcessor(ExternalLibraries.daggerAndroidProcessor)

    testImplementation(TestLibraries.junit)
    androidTestImplementation(AndroidXLibraries.testRunner)
    androidTestImplementation(AndroidXLibraries.espresso)
    implementation(KotlinDependencies.kotlinStandardLibrary)
    implementation(project(Modules.repository))

}
repositories {
    mavenCentral()
}
