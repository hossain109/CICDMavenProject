pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                git branch: 'main', url: 'https://github.com/hossain109/CICDMavenProject.git'
            }
        }
        stage('Test') {
            steps {
                sh 'java --version'

            }
        }
    }
}
