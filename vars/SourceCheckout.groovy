def call (def giturl, def branch){
        echo ""
		echo ""********************** Git URL: ${giturl} ***********"
		echo "hey am checking in"
		echo "*********************** Git Branch: ${branch} *********"
		echo "hey am still validating it"
		if(giturl.contains("github.com"))
		{
		checkout([$class: 'GitSCM', branches: [[name: branch ]], extensions: [], userRemoteConfigs: [
		                 [credentialsId: 'github_cred', url: giturl]
						 ]])
		}
		else
		{
		    error("Please provide valid github url")
		}
	}
