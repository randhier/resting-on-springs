pipeline {
    agent any
    stages {
        stage('Launch Second Job') {
            steps {
                build job: 'second'
            }
        }
        stage('Test') {
            steps {
                echo "Start Test"
            }
        }
        stage('Deploy') {
            steps {
                echo "Start Deploy"
            }
        }
    }
}