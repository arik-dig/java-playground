pluginManagement {
  plugins {
  }

  repositories {
    mavenCentral()
    gradlePluginPortal()
  }
}

dependencyResolutionManagement {
  repositories {
    mavenCentral()
    mavenLocal()
  }
}

rootProject.name = "mutli-misc"

// libs
include(":libs:some-lombok")

// apps
include(":apps:memcached")
include(":apps:spring-boot-service1")

// benchmark
