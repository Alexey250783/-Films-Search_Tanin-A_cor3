import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    kotlin("kapt")
    id("kotlin-parcelize")
}
kotlin

kotlin {
    compilerOptions {
        jvmTarget = JvmTarget.fromTarget("1.8")
    // Если были другие настройки, например freeCompilerArgs, их тоже нужно перенести.
    // freeCompilerArgs.addAll(listOf("-Xopt-in=kotlin.RequiresOptIn"))
    }
}


android {
    namespace = "com.example.filmssearch3"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.filmssearch3"
        minSdk = 34
        targetSdk = 34
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

    buildFeatures {
        viewBinding = true
        dataBinding = true
        buildConfig = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

}

dependencies {

    implementation(libs.squareup.logging.interceptor)
    implementation(libs.okhttp)
    val roomVersion = "2.8.4"
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.cardview)
    implementation(libs.androidx.fragment)
    implementation(libs.androidx.recyclerview)
    implementation(libs.glide)
    implementation(libs.compiler)
    implementation(libs.converter.moshi)
    implementation(libs.retrofit2.converter.gson)
    implementation(libs.retrofit2.retrofit)
    implementation(libs.dagger)
    implementation(libs.car.ui.lib.plugin.apis)
    implementation(libs.swiperefreshlayout)
    implementation(libs.runtime)
    implementation(libs.room.compiler)
    implementation(libs.androidx.room.ktx)
    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.compiler)
    implementation(libs.androidx.room.testing)
    kapt(libs.dagger.compiler)
    implementation(libs.com.android.legacy.kapt.gradle.plugin)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}