def call(String mavenVersion) {
    echo "Building with Maven version ${mavenVersion}"
    com.library.MavenBuilder.build(this, mavenVersion, 'clean package')
}
