def call(String mavenVersion, String goals = 'clean package') {
    com.mycompany.maven.MavenBuilder.build(this, mavenVersion, goals)
}



// com.mycompany.maven.MavenBuilder.build(this, mavenGoals, mavenOpts)