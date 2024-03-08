def call(){
  echo "Terraform plan in progress.."
    sh '''
      cd terraform_sharelibs/tfscripts/users_creation
      terraform plan
  '''
}
