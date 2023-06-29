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

// apps
include(":apps:memcached")

// benchmark
