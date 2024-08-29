rootProject.name = "Unit-Test-Workshop"

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
    plugins {
        id("de.fayard.refreshVersions") version "0.60.5"
    }
}

plugins {
    id("de.fayard.refreshVersions")
}
