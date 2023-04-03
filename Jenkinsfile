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
        
        
        stage('Build Docker Image') {
            steps {
                script{
                    dockerImage = docker.build ("jenkinsdockerwithawsecr")
                }    
            }
        }
            
        stage('Pushing Docker Image to Amazon ECR') {
            steps {
               script {
               docker.withRegistry('https://670527263574.dkr.ecr.us-east-1.amazonaws.com  ','  ecr:us-east-1:AWS_CREDENTIALS_ID ') {
	      dockerImage.push("$env.BUILD_NUMBER")
              	   
			   
			   
			   }
		 }
            }
        }   
        
    }
}
