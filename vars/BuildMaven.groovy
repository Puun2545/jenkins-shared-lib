def call(String mavenVersion, String goals = 'clean package') {
    echo "Building with Maven version ${mavenVersion}"
    com.library.MavenBuilder.build(this, mavenVersion, goals)
}
