plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.ud03_2_halloween"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.ud03_2_halloween"
        minSdk = 24
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
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    dependencies {
        val fragment_version = "1.8.5"
        // Java language implementation
        implementation("androidx.fragment:fragment:$fragment_version")
        // Kotlin
        implementation("androidx.fragment:fragment-ktx:$fragment_version")
        // Compose
        implementation("androidx.fragment:fragment-compose:$fragment_version")
        // Testing
        debugImplementation("androidx.fragment:fragment-testing:$fragment_version")
    }
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}