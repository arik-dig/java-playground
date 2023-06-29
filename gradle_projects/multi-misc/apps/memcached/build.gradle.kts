plugins {
    `java-library`
    kotlin("jvm") version "1.8.22"
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

dependencies {
    implementation(kotlin("stdlib"))
}
