plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.ksp)
}
val roomVersion = "2.8.5"


android {
    namespace = "com.example.filmssearch3"
    compileSdk = 37

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
            //noinspection NotShrinkingResources
            isMinifyEnabled = true
            buildConfigField("String", "BASE_URL", "\"https://api.prod.com/\"")
            buildConfigField("String", "API_KEY", "\"prod_key_456\"")
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
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

// Вместо kotlinOptions — используем новый блок Kotlin (AGP 9)
kotlin {
    compilerOptions {
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_1_8)
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.paging.rxjava2)
    implementation(libs.androidx.room3.common)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.cardview)
    implementation(libs.androidx.fragment)
    implementation(libs.androidx.recyclerview)
    implementation(libs.glide)
    implementation(libs.compiler)
    implementation(libs.adapter.rxjava)
    implementation(libs.converter.moshi)
    implementation(libs.retrofit2.converter.gson)
    implementation(libs.retrofit2.retrofit)
    implementation(libs.okhttp3.logging.interceptor)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.dagger)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.swiperefreshlayout)
    ksp(libs.dagger.compiler)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation(project(":remote_module"))
    implementation(libs.rxjava3)
    implementation(project(":remote_module"))
    implementation("io.reactivex.rxjava3:rxjava:3.1.8")
}