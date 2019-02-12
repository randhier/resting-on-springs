pipeline {
    agent any
    environment {
        SECOND = 'true'
    }
    stages {
        stage('Check if Second job can launch'){
            steps {
                echo "Second: ${env.SECOND}"
                env.SECOND == true
                echo "Second: ${env.SECOND}"
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