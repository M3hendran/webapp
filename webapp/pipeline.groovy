pipeline {
	
	agent any
	
	stages{ 
		
		stage("Init"){
			
			steps {
				
				echo "Executing initilization of script..."
			}
		}
		stage("Staging"){
			
			steps{
				
				echo "Executing staging script..."
			}
		}
	
		stage ("Production"){
			
			steps {
				
				echo "Executing production script..."
			}
		}
    }
	
}