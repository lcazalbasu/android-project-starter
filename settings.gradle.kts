import java.io.FileInputStream
import java.util.Properties

gradle.startParameter.excludedTaskNames.addAll(listOf(":build-logic:convention:testClasses"))

pluginManagement {
    includeBuild("build-logic")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        mavenLocal()
    }
}

fun getLocalProperty(key: String): String {
    val prop = Properties().apply {
        load(FileInputStream(File(rootProject.projectDir, "local.properties")))
    }
    return prop.getProperty(key)
}

rootProject.name = "StarterApp"
include(":app")
 