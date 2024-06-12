package com.library

class MavenBuilder {
    // building with Maven
    static def build(script, String mavenVersion, String goals) {
        script.sh "${script.env.MAVEN_HOME}/bin/mvn ${goals} -Dproject.version=${mavenVersion}"
    }
}


