pipeline {
	
	agent any
	
	stages {
		
		stage('Building application code'){
			
			steps{
				
				echo 'Started building application code'
				
				sh 'mvn clean package'
	
			}
			post {
				
				success {
					
					echo 'Preparing artifacts of the application'
					
					archiveArtifacts artifacts: '**/*.war'
				}
			}
			
		}
		stage ('Deploying application in Staging') {
			
			echo 'Deploying artifacts in staging in Tomcat Server'
			
			build job: 'Tomcat_Application_Staging'
			
		}
		
	}
	
	
}