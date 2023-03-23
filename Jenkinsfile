pipeline {
    environment {
               
        AWS_ACCOUNT_ID='670527263574'
        AWS_DEFAULT_REGION='us-east-1'
        IMAGE_REPO_NAME='jenkinsdocker'
        IMAGE_TAG='2.0'
        REPOSITORY_URI = '${AWS_ACCOUNT_ID}.dkr.ecr.${AWS_DEFAULT_REGION}.amazonaws.com/ ${IMAGE_REPO_NAME}'
        
    }
    agent any    
    
    tools{ 
        maven 'Default'
    }

    stages {
    
      stage('Logging to AWS ECR') {
            steps {
                script{
                    sh 'aws ecr get-login-password --region ${AWS_DEFAULT_REGION} | docker login --username AWS --password-stdin $     {AWS_ACCOUNT_ID}.dkr.ecr.${AWS_DEFAULT_REGION}.amazonaws.com'
                    
                }    
            }
        }
        
    
    
    
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
                    dockerImage = docker.build '${IMAGE_REPO_NAME}:${IMAGE_TAG}'
                }    
            }
        }
            
        stage('Pushing Docker Image to Amazon ECR') {
            steps {
                script{                    
                    sh 'docker tag ${IMAGE_REPO_NAME}:${IMAGE_TAG} ${REPOSITORY_URI}:$IMAGE_TAG'
                    sh 'docker push ${AWS_ACCOUNT_ID}.dkr.ecr.${AWS_DEFAULT_REGION}.amazonaws.com/${IMAGE_REPO_NAME}:${IMAGE_TAG}'
                    
                    
                }
            }
        }   
        
    }
}
