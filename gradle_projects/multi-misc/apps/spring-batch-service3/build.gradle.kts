plugins {
    java
    kotlin("jvm") version "1.8.22"
    id("org.springframework.boot") version "3.1.1"
    id("io.spring.dependency-management") version "1.1.0"
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

    implementation("jakarta.xml.bind:jakarta.xml.bind-api")
    implementation("org.springframework.boot:spring-boot-starter-batch")
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-actuator")

    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitJupiterVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitJupiterVersion")
    testImplementation("org.mockito:mockito-junit-jupiter:$mockitoVersion")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.test {
    useJUnitPlatform()
}

tasks.bootRun {
    if (project.hasProperty("digma")) {
        val tempDir = System.getProperty("java.io.tmpdir")
        environment["JAVA_TOOL_OPTIONS"] = "-javaagent:${tempDir}temp-digma-otel-jars1/opentelemetry-javaagent.jar"
        systemProperty("otel.exporter.otlp.traces.endpoint", "http://localhost:5050")
        systemProperty("otel.traces.exporter", "otlp")
        systemProperty("otel.metrics.exporter", "none")
        systemProperty("otel.service.name", project.name)
        systemProperty("otel.javaagent.extensions", "${tempDir}temp-digma-otel-jars1/digma-otel-agent-extension.jar")
    }
}
