package com.mycompany.maven

class MavenBuilder {
    static def build(script, String mavenGoals, String mavenOpts = '') {
        script.sh "mvn ${mavenOpts} ${mavenGoals}"
    }
}

