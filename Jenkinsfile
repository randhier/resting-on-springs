pipeline {
    agent any
    environment {
        SECOND = 1
    }
    stages {
        stage('Check if Second job can launch'){
            steps {
                script {
                    echo $env.SECOND
                    echo $SECOND
                    env.SECOND = 2
                    SECOND = 3
                }
            }
        }
        stage('Launch Second Job') {
            steps {
                echo "${env.SECOND}"
                script {
                    echo $env.SECOND
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