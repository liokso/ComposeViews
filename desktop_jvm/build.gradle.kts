/*
 * Copyright lt 2022
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
    id("maven-publish")
}

group = "com.github.ltttttttttttt"
version = githubVersion

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
    withSourcesJar()//this
    withJavadocJar()//this
}

publishing {
    publications {
        create("maven_desktop", MavenPublication::class) {
            groupId = "com.github.ltttttttttttt"
            artifactId = "maven_desktop"
            version = githubVersion
            from(components.getByName("kotlin"))
        }
    }
}

dependencies {
    api(project(":core"))
    //desktop图片加载器
    api("com.github.ltttttttttttt:load-the-image:1.0.5")
    //协程
    api("org.jetbrains.kotlinx:kotlinx-coroutines-swing:$coroutinesVersion")

}