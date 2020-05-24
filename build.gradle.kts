buildscript {

    repositories {
        mavenCentral()
    }
    dependencies {
    }
}

group = "com.fueled"
version = "1.0-SNAPSHOT"

plugins {
    kotlin("jvm") version "1.3.72"
}


repositories {
    jcenter()
}


dependencies {
    kotlin("stdlib-jdk8", "1.3.72")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.5")
    implementation("com.google.code.gson:gson:2.8.6")

}

fun DependencyHandler.implementation(depName: String) {
    add("implementation", depName)
}