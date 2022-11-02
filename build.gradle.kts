import java.util.Base64
val kotlin_version: String by project

plugins {
    application
    kotlin("jvm") version "1.6.10"
}

group = "com.sergeysav"
version = "0.0.1"

application {
    mainClass.set("com.sergeysav.ApplicationKt")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=true")
}

repositories {
    mavenCentral()
    maven { url = uri("https://maven.pkg.jetbrains.space/public/p/ktor/eap") }
    maven {
        url = uri("https://maven.pkg.github.com/SergeySave/WebsiteGenerator")
        credentials {
            username = "SergeySave"
            password = String(Base64.getDecoder().decode("Z2hwX2dYanZYUmVDOEtvNUZWOEczQ3JrVUhkdUszMnBTTzBQNXp2TA=="))
        }
    }
}

dependencies {
    implementation("com.sergeysav:website-generator:1.0.2")
    api("org.jetbrains.kotlinx:kotlinx-html-jvm:0.7.3")
    api("org.jetbrains.kotlin-wrappers:kotlin-css:1.0.0-pre.312-kotlin-1.6.10")
    implementation(kotlin("reflect"))
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "17"
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
