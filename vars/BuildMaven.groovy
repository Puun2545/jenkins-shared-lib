def call(String mavenVersion, String goals = 'clean package') {
    com.library.MavenBuilder.build(this, mavenVersion, goals)
}



// com.mycompany.maven.MavenBuilder.build(this, mavenGoals, mavenOpts)