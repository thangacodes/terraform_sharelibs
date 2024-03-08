def call(){
  echo "Terraform initialization in progress"
  sh '''
     cd terraform_sharelibs/tfscripts/users_creation
     terraform init
  '''
}
