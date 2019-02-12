pipeline {
    agent any
    environment {
        SECOND = 'true'
    }
    stages {
        stage('Check if Second job can launch'){
            steps {
                echo "Second: ${SECOND}"
                SECOND == true
                echo "Second: ${SECOND}"
            }
        }
//        stage('Launch Second Job') {
//            when {
//                expression {  }
//            }
//            steps {
//                build job: 'second'
//            }
//        }
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