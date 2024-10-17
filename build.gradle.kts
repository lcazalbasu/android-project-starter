// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false

    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.jetbrains.kotlin.kapt) apply false

    alias(libs.plugins.google.devtools.ksp) apply false
    alias(libs.plugins.compose.compiler) apply false
    alias(libs.plugins.room) apply false

    alias(libs.plugins.com.diffplug.spotless) apply false
}

apply {
    from("${project.rootDir}/spotless.gradle")
}

val buildFeatures by extra {
    mutableMapOf<String, Boolean>(
        "enableSomeFeature" to false,       // Enable the [feature name] feature
    )
}