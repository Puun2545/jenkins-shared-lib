def call(String mavenGoals, String mavenOpts = '') {
    com.library.MavenBuilder.build(this, mavenGoals, mavenOpts)
}


// com.mycompany.maven.MavenBuilder.build(this, mavenGoals, mavenOpts)