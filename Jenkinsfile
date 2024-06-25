pipeline {
    agent { label 'MyNode' }
    stages {
        stage('build') {
            steps {
                git branch: 'main', url: 'https://github.com/hossain109/CICDMavenProject.git'
            }
        }
    }
}
