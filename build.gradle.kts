plugins {
	java
	id("war")
	id("org.springframework.boot") version "3.5.7"
	id("io.spring.dependency-management") version "1.1.7"
}

group = "com.mybatis"
version = "0.0.1-SNAPSHOT"
description = "Practice mybatis on java spring"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
	implementation("org.glassfish.web:jakarta.servlet.jsp.jstl:3.0.1")
	implementation("org.apache.tomcat.embed:tomcat-embed-jasper")
	implementation("org.mybatis.spring.boot:mybatis-spring-boot-starter:3.0.5")
	runtimeOnly("org.postgresql:postgresql")
	implementation("com.zaxxer:HikariCP:7.0.2")
	compileOnly("org.projectlombok:lombok")
	annotationProcessor("org.projectlombok:lombok")
	implementation("org.mapstruct:mapstruct:1.6.3")
	annotationProcessor("org.mapstruct:mapstruct-processor:1.6.3")}

tasks.withType<Test> {
	useJUnitPlatform()
}
