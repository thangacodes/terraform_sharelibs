def call(){
	echo "Cloning the code repo from GitHub.."
	sh '''
              git clone https://github.com/thangacodes/terraform_sharelibs.git
              cd terraform_sharelibs/tfscripts/users_creation
	      '''
}
