pipeline {
	
	agent any
	
	stages {
		
		stage('Building application code'){
			
			steps{
				
				echo 'Started building application code'
				
				sh 'mvn -f webapp/pom.xml clean package'
				
				echo 'Preparing artifacts of the application...'
				
				archiveArtifacts artifacts: '**/*.war'

	
			    }
				
		}
		stage('Deploying application in Staging'){
			
			steps{
						
				build job: 'Tomcat_Application_Staging'
			}
		}
		
	}
	
	
}