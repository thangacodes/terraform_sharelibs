def call(){
  echo "Terraform validate in progress.."
  sh '''
      cd terraform_sharelibs/tfscripts/users_creation
      terraform validate
  '''
}
