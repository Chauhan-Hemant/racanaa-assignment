pipeline {
    agent any

    stages {
        stage('Get Source Code') {
            steps {
                git credentialsId: '98388559-3d3a-422f-b064-13d554412673', url: 'https://github.com/Chauhan-Hemant/racanaa-assignment.git'
                echo 'Hello World'
            }
        }
        stage('Build Code') {
            steps {
                bat script: 'mvn compile'
            }
        }
        stage('Run Test') {
            steps {
                bat script: 'mvn test -Dbrowser=localchrome'
            }
        }
    }
}