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
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

        debug {
            apply {
                buildConfigField("String", "API_KEY", "\"your_debug_api_key_here\"")
            }
        }
        release {
            apply {
                buildConfigField("String", "API_KEY", "\"your_release_api_key_here\"")
            }
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        viewBinding = true
        dataBinding = true
    }

    buildFeatures {
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
    implementation(libs.design.bottomnavigation)
    implementation(libs.customview)
    implementation(libs.androidx.animation.graphics.android)
    implementation(libs.androidx.fragment)
    implementation(libs.androidx.compiler)
    implementation(libs.androidx.recyclerview)
    implementation(libs.cardview.v7)
    implementation(libs.glide)
    implementation(libs.compiler)
    implementation(libs.design.floatingactionbutton)
    implementation(libs.design.bottomappbar)
    implementation(libs.design.widget)
    implementation(libs.androidx.versionedparcelable)
    implementation(libs.versionedparcelable)
    implementation(libs.androidx.lifecycle.extensions)
    implementation(libs.coordinatorlayout)
    implementation(libs.design.circularreveal.coordinatorlayout)
    implementation(libs.androidx.media3.datasource.okhttp)
    implementation(libs.adapter.rxjava)
    implementation(libs.converter.moshi)
    implementation(libs.retrofit2.converter.gson)
    implementation(libs.retrofit2.retrofit)
    implementation(libs.okhttp3.logging.interceptor)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.com.android.application.gradle.plugin)
    implementation(libs.org.jetbrains.kotlin.android.gradle.plugin)
    implementation(libs.kotlin.stdlib)
    implementation(libs.dagger)
    implementation(libs.dagger.compiler)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
