def call(){
  echo "Terraform apply with auto approval in progress"
    sh '''
      cd terraform_sharelibs/tfscripts/users_creation
      terraform apply --auto-approve
  '''
}
