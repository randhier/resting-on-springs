pipeline {
    agent any
    parameters {
        booleanParam(defaultValue: false, description: '', name: 'second')
    }
    stages {
        stage('Check if Second job can launch'){
            steps {
                echo "Second: ${params.second}"
                params.second == true
            }
        }
        stage('Launch Second Job') {
            when {
                expression { return params.second }
            }
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