package com.library

class Hello {
    static def build(script, String mavenVersion, String goals = 'clean package') {
        script.sh "${script.env.MAVEN_HOME}/bin/mvn ${goals} -Dproject.version=${mavenVersion}"
    }
}
