plugins {
    `java-library`
    kotlin("jvm") version "1.8.22"
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

val junitJupiterVersion = "5.9.2"
val mockitoVersion = "5.2.0"

dependencies {
    implementation(kotlin("stdlib"))

    implementation("net.spy:spymemcached:2.12.3")

    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitJupiterVersion")
    testRuntimeOnly   ("org.junit.jupiter:junit-jupiter-engine:$junitJupiterVersion")
    testImplementation("org.mockito:mockito-junit-jupiter:$mockitoVersion")
}

tasks.test {
    useJUnitPlatform()
}
