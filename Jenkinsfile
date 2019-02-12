pipeline {
    agent any
    environment {
        SECOND = 1
    }
    stages {
        stage('Check if Second job can launch'){
            steps {
                script {
                    echo $SECOND
                    SECOND = 3
                }
            }
        }
        stage('Launch Second Job') {
            steps {
                script {
                    echo $SECOND
                }
            }
//            when {
//                expression {  }
//            }
//            steps {
//                build job: 'second'
//            }
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