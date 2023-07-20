plugins {
    java
    id("org.springframework.boot") version "3.1.1"
    id("io.spring.dependency-management") version "1.1.0"
}

group = "ru.embraceddx"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("jakarta.xml.bind:jakarta.xml.bind-api:2.3.2")
    implementation("org.springframework.boot:spring-boot-starter-web:2.6.7")
    implementation("fr.inria.gforge.spoon:spoon-core:10.4.0")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
