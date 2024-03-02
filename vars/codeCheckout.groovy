def call(){
	echo "Cloning the code repo from GitHub.."
	sh '''
              git clone https://github.com/thangacodes/terraform_sharelibs.git
	      pwd
              cd terraform_sharelibs/user_account
	      '''
}
