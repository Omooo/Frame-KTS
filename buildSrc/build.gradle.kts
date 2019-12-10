val kotlinVersion = "1.3.50"
buildscript {
    repositories {
        mavenLocal()
        google()
        mavenCentral()
        jcenter()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.50")
    }
}

plugins {
    `kotlin-dsl`
}

sourceSets.getByName("main") {
    java.srcDir("src/main/java")
    java.srcDir("src/main/kotlin")
}
sourceSets.getByName("test") {
    java.srcDir("src/test/java")
    java.srcDir("src/test/kotlin")
}

repositories {
    google()
    jcenter()
}

dependencies {
    gradleApi()
    localGroovy()
    implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
    implementation("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")
    testImplementation("org.jetbrains.kotlin:kotlin-test:$kotlinVersion")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlinVersion")
}
