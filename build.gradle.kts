plugins {
    id("org.jetbrains.kotlin.jvm") version "1.6.10"
    id("org.jetbrains.kotlin.kapt") version "1.6.10"
    id("org.jetbrains.kotlin.plugin.allopen") version "1.6.10"
    id("com.github.johnrengelman.shadow") version "7.1.2"
    id("io.micronaut.application") version "3.3.2"
    kotlin("plugin.serialization") version "1.6.20"
    groovy
}

version = "0.1"
group = "gravie.micronaut"

val kotlinVersion=project.properties.get("kotlinVersion")
repositories {
    mavenCentral()
}

dependencies {
    kapt("io.micronaut:micronaut-http-validation")
    implementation("io.micronaut:micronaut-http-client")
    implementation("io.micronaut:micronaut-jackson-databind")
    implementation("io.micronaut:micronaut-runtime")
    implementation("io.micronaut.kotlin:micronaut-kotlin-runtime")
    implementation("jakarta.annotation:jakarta.annotation-api")
    implementation("org.jetbrains.kotlin:kotlin-reflect:${kotlinVersion}")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${kotlinVersion}")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2")
    implementation("javax.inject:javax.inject:1")

    testImplementation("org.codehaus.groovy:groovy-all:3.0.8")
    testImplementation(platform("org.spockframework:spock-bom:2.0-M4-groovy-3.0"))
    testImplementation("org.spockframework:spock-core:2.0-M4-groovy-3.0")
    testImplementation("io.micronaut.test:micronaut-test-spock")

    annotationProcessor("io.micronaut:micronaut-inject-java:1.0.0")

    runtimeOnly("ch.qos.logback:logback-classic")
    implementation("io.micronaut:micronaut-validation")

    runtimeOnly("com.fasterxml.jackson.module:jackson-module-kotlin")

}


application {
    mainClass.set("gravie.micronaut.ApplicationKt")
}
java {
    sourceCompatibility = JavaVersion.toVersion("17")
}

tasks {
    compileKotlin {
        kotlinOptions {
            jvmTarget = "16"
        }
    }
    compileTestKotlin {
        kotlinOptions {
            jvmTarget = "17"
        }
    }
}
graalvmNative.toolchainDetection.set(false)
micronaut {
    runtime("netty")
    testRuntime("junit5")
    processing {
        incremental(true)
        annotations("gravie.micronaut.*")
    }
}


