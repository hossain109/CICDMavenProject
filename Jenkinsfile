pipeline {
    agent { label 'MyNode' }
    stages {
        stage('build') {
            steps {
                git branch: 'main', url: 'https://github.com/hossain109/CICDMavenProject.git'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn --version'
                sh 'java --version'
                sh 'git --version'
            }
        }
        stage('Deploy') {
            steps {
                echo "Deploying"
            }
        }
    }
}
