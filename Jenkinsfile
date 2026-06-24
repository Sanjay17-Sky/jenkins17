pipeline {
    agent any
    stages {
        stage('Clone Code') {
            steps {
                git branch: 'master',
                url: 'https://github.com/Sanjay17-Sky/jenkins17'
                }
            }
                stage('Compile Code') {
                    steps {
                        bat 'javac demo.java'
                        }
                    }
                        stage('Run Code') {
                            steps {
                                bat 'java demo'             
                                }
                            }
                        }
                    } 
