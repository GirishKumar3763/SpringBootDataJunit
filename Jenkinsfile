pipeline {
    agent any
    
    tools{ 
        maven 'Default'
    }

    stages {
        stage('Clone the Repository') {
            steps {
                git branch: 'main', credentialsId: 'girish_github_user_password', url: 'https://github.com/GirishKumar3763/SpringBootDataJunit.git'
            }
        }
        
        stage('Build Project') {
            steps {
                sh 'mvn clean install'
            }
        }
        
        stage('Unit Testing') {
            steps {
                sh 'mvn test'
            }
        }
        
        stage('Build Docker Image') {
            steps {
                script{
                    sh 'docker build -t girishkumar007/dockerwithjenkins:1.0 .'
                }    
            }
        }
            
        
        
    }
}
