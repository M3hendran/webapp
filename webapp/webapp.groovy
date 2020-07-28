import org.hamcrest.Description

job ('Automating job with DSL Plugin'){
	
		description('This script will automatically create a jenkins job')
	
	scm {
		
		git('https://github.com/M3hendran/webapp.git','master')
	}
	
	triggers {
		
		scm('* * * * *')
	}
	
	steps {
		
		maven('clean package','webapp/pom.xml')
	}
	
	publishers {
		
		archiveArtifacts '**/*.war'
	}
}
