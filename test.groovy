pipeline {
    agent any

    stages {
        stage('Get Source Code') {
            steps {
                git credentialsId: '2a35fe19-cf1f-4668-9aa5-6b5db4240fb3', url: 'https://github.com/Chauhan-Hemant/racanaa-assignment.git'
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
