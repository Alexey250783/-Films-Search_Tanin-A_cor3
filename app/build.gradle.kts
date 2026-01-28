plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    kotlin("kapt")
}

android {
    namespace = "com.example.filmssearch3"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.filmssearch3"
        minSdk = 34
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("debug") {
            isMinifyEnabled = false
            buildConfigField("String", "BASE_URL", "\"https://api.test.com/\"")
            buildConfigField("String", "API_KEY", "\"test_key_123\"")
        }

        getByName("release") {
            isMinifyEnabled = true
            buildConfigField("String", "BASE_URL", "\"https://api.prod.com/\"")
            buildConfigField("String", "API_KEY", "\"prod_key_456\"")
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
        dataBinding = true
        buildConfig = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}
dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.cardview)
    implementation(libs.androidx.fragment)
    implementation(libs.androidx.recyclerview)
    implementation(libs.glide)
    implementation(libs.compiler)
    implementation(libs.androidx.lifecycle.extensions)
    implementation(libs.adapter.rxjava)
    implementation(libs.converter.moshi)
    implementation(libs.retrofit2.converter.gson)
    implementation(libs.retrofit2.retrofit)
    implementation(libs.okhttp3.logging.interceptor)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.kotlin.stdlib)
    implementation(libs.dagger)
    implementation(libs.car.ui.lib.plugin.apis)
    kapt(libs.dagger.compiler)
    implementation(libs.androidx.material3)
    implementation(libs.com.android.legacy.kapt.gradle.plugin)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}

