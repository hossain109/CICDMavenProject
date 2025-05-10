pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                git branch: 'main', url: 'https://github.com/hossain109/CICDMavenProject.git'
                sh 'ls'
            }
        }
        stage('Test') {
            steps {
                sh 'java --version'
                sh ' mvn clean package'

            }
        }
        stage('SonarQube Analysis') {
            steps {
                script {  // Required for variable declarations and complex logic 
                    def mvn = tool 'jenkins-maven'  // Get Maven tool
                    withSonarQubeEnv('sonarqube server') {  // Use SonarQube environment
                        sh "${mvn}/bin/mvn clean verify sonar:sonar -Dsonar.projectKey=maven-project -Dsonar.host.url=http://192.168.178.158:9000 -Dsonar.login=sqp_26f25fe0ab2b2c1b5180ebf4094ccc639fa0771f"
                    }
                }
            }
        }
        stage('Build docker image and image'){
        environment{
            DOCKER_IMAGE="sohrab109/maven:${BUILD_NUMBER}"
            REGISTRY_CREDENTIALS = credentials('cred-docker')
        }
        steps{
            script{
            sh 'docker build -t ${DOCKER_IMAGE} .'
            def dockerImage = docker.image("${DOCKER_IMAGE}")
                docker.withRegistry('https://index.docker.io/v1/', "cred-docker") {
                dockerImage.push()
                    }
                }
            }
        }
    }
}
