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

            }
        }
        stage('Deploy') {
            steps {
                echo "Deploying"
            }
        }
    }
}
