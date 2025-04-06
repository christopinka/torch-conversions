plugins {
    kotlin("jvm") version "2.1.10"
    application
}

group = "org.torch.conversions"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        url = uri("https://releases.aspose.com/java/repo/")
    }
}

dependencies {
    // https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml
    implementation("org.apache.poi:poi-ooxml:5.4.0")
    // https://mvnrepository.com/artifact/com.google.code.gson/gson
    implementation("com.google.code.gson:gson:2.12.1")
    // https://mvnrepository.com/artifact/software.amazon.awssdk/s3
    implementation("software.amazon.awssdk:s3:2.31.14")

    implementation("aws.sdk.kotlin:dynamodb:1.0.0")
    implementation("aws.sdk.kotlin:s3:1.0.0")
    implementation("aws.sdk.kotlin:sns:1.0.0")
//    implementation("aws.sdk.kotlin:rekognition:1.0.0")
//    implementation("aws.smithy.kotlin:http-client-engine-okhttp:0.30.0")
//    implementation("aws.smithy.kotlin:http-client-engine-crt:0.30.0")
//    implementation("org.springframework.boot:spring-boot-starter-web:2.7.5")
//    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.3")
//    implementation("org.jetbrains.kotlin:kotlin-reflect")
//    implementation("com.amazonaws:aws-java-sdk-lambda:1.12.429")
//    implementation("com.amazonaws:aws-lambda-java-core:1.2.2")
//    implementation("com.amazonaws:aws-lambda-java-events:3.11.1")
//    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
//    implementation("javax.mail:javax.mail-api:1.6.2")
//    implementation("com.sun.mail:javax.mail:1.6.2")
//    implementation("com.google.code.gson:gson:2.10")
//    implementation("org.json:json:20230227")
//    implementation("com.googlecode.json-simple:json-simple:1.1.1")
//    testImplementation("org.springframework.boot:spring-boot-starter-test:2.7.3")


    testImplementation(kotlin("test"))
}

application {
    mainClass = "org.example.AppKt"
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}