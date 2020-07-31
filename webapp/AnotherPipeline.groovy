pipeline {
	
	agent any
	
	stages("Building application code...") {
		
		steps{
			
			echo "Started building application code..."
			
			sh "mvn clean package"
		}
		post {
			
			success {
				
				echo "Preparing artifacts of the application..."
				
				archiveArtifacts artifacts: "**/*.war"
			}
		}
	}
	
	
}