plugins {
    alias(libs.plugins.android.application)
<<<<<<< HEAD
=======
    alias(libs.plugins.kotlin.android)
>>>>>>> master
}

android {
    namespace = "com.namimeow.roleworld"
<<<<<<< HEAD
    compileSdk {
        version = release(36) {
            minorApiLevel = 1
        }
    }
=======
    compileSdk = 35
>>>>>>> master

    defaultConfig {
        applicationId = "com.namimeow.roleworld"
        minSdk = 31
<<<<<<< HEAD
        targetSdk = 36
=======
        targetSdk = 35
>>>>>>> master
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
<<<<<<< HEAD
            optimization {
                enable = false
            }
=======
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
>>>>>>> master
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
<<<<<<< HEAD
}

dependencies {
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
    implementation(libs.androidx.core.splashscreen)
=======
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    // Splash
    implementation(libs.androidx.core.splashscreen)

    // Retrofit
    implementation(libs.retrofit)
    implementation(libs.retrofit2.converter.gson)

    // Logger
    implementation(libs.logging.interceptor)

    // Coil
    implementation(libs.coil.compose)

    // RxJava
    compileOnly(libs.rxkotlin)

    // Preferences
    implementation(libs.androidx.preference)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
>>>>>>> master
}