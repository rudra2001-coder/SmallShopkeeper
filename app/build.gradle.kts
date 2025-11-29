plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.hilt)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.ksp)
}

android {
    namespace = "com.rudra.smallshopkeeper"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "com.rudra.smallshopkeeper"
        minSdk = 28
        targetSdk = 36
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
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {


    // ========== HILT DEPENDENCIES ==========

    // Hilt Core
    implementation("com.google.dagger:hilt-android:2.48.1")
    ksp("com.google.dagger:hilt-compiler:2.48.1")

    // Hilt Navigation (Compose)
    implementation("androidx.hilt:hilt-navigation-compose:1.0.0")

    // Hilt Navigation (Fragment/Activity)
    implementation("androidx.hilt:hilt-navigation-fragment:1.0.0")
    implementation("androidx.hilt:hilt-work:1.0.0")

    // Hilt for ViewModel
    implementation("androidx.hilt:hilt-lifecycle-viewmodel:1.3.0")




    // ========== ROOM DEPENDENCIES ==========

    // Room Core
    implementation("androidx.room:room-runtime:2.6.0")
    ksp("androidx.room:room-compiler:2.6.0")

    // Room Kotlin Extensions (Coroutines/Flow support)
    implementation("androidx.room:room-ktx:2.6.0")

    // Room Testing
    testImplementation("androidx.room:room-testing:2.6.0")

    // Room Paging Integration (if using Paging)
    implementation("androidx.room:room-paging:2.6.0")

    // Optional: Room with RxJava
    implementation("androidx.room:room-rxjava2:2.6.0")
    implementation("androidx.room:room-rxjava3:2.6.0")

    // Your existing lifecycle dependency
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation("androidx.compose.material:material-icons-extended")

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    debugImplementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
}