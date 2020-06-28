plugins {
    id("org.springframework.boot") version ("2.3.1.RELEASE")
    id("io.spring.dependency-management") version "1.0.8.RELEASE"
    kotlin("plugin.jpa") version "1.3.72"
    kotlin("jvm") version "1.3.72"
//    kotlin("plugin.spring") version "1.3.72"
}


group = "dev.sayem"
version = "0.0.1-SNAPSHOT"

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.8"
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    runtimeOnly("com.h2database:h2")
//    version ("1.4.200")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")


    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
    }
}

//test {
//    useJUnitPlatform()
//}
