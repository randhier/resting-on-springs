pipeline {
    agent any
    stages {
        stage('Launch Second Job') {
            steps {
                build job: 'api-build-s3-pipeline'
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