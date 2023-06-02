pipeline {
    agent any

    stages {
        stage('Get Source Code') {
            steps {
                git branch: 'main', credentialsId: 'git_credentials', url: 'https://github.com/Chauhan-Hemant/racanaa-assignment.git'
            }
        }
        stage('Build Project') {
            steps {
                bat script: 'mvn compile'
            }
        }
        stage('Execute Tests') {
            steps {
                bat script: 'mvn test'
            }
        }
        stage('Publish Test Reports') {
            steps {
                bat script: 'mvn surefire-report:report-only'
            }
        }
    }
    
    post {
        always {
            cleanWs()
        }
    }
}