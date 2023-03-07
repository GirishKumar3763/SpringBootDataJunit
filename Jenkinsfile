pipeline {
    agent any
    
    tools{ 
        maven 'default'
    }

    stages {
        stage('Clone the Repository') {
            steps {
                git branch: 'main', credentialsId: 'girish_github_user_password', url: 'https://github.com/GirishKumar3763/SpringBootDataJunit.git'
            }
        }
        
        stage('Build') {
            steps {
                bat 'mvn install'
            }
        }
        
    }
}
