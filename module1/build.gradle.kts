plugins {
    id("org.jetbrains.kotlin.jvm")
}

group = rootProject.group
version = rootProject.version

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":module2"))

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.9.0")
    runtimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")
    runtimeOnly("org.junit.platform:junit-platform-console:1.9.0")

}

tasks.test {
    useJUnitPlatform()
}