plugins {
    `java-library`
    kotlin("jvm") version "1.8.22"
    id("io.freefair.lombok") version "8.1.0"
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

val junitJupiterVersion = "5.9.2"

dependencies {
    implementation(kotlin("stdlib"))

    implementation("org.projectlombok:lombok:1.18.26")

    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitJupiterVersion")
    testRuntimeOnly   ("org.junit.jupiter:junit-jupiter-engine:$junitJupiterVersion")
}

tasks.test {
    useJUnitPlatform()
}
