pipeline {
    agent any

    tools {
        maven 'M2_HOME'
    }

    stages {
        stage('Checkout code') {
            steps {
                git branch: 'master', url: 'https://github.com/eya-amri/CountryRepo.git'
            }
        }

        stage('Compile code') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test code') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package code') {
            steps {
                sh 'mvn package'
            }
        }
        stage('Package code') {
            steps
            {
                sh 'mvn package '
            }
        }
       

    }

    post {
        always {
            junit allowEmptyResults: true, testResults: '**/target/surefire-reports/*.xml'
        }
    }
}

