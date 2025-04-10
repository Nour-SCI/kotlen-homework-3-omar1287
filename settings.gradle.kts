rootProject.name = "kotlen-homework-3-omar1287"

pluginManagement {
    plugins {
        id("org.jetbrains.kotlin.jvm") version "1.8.22"
    }
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

include("module1", "module2")