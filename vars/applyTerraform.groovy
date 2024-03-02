def call(){
  echo "Terraform apply with auto approval in progress"
    sh '''
      cd terraform_sharelibs/user_account
      terraform apply --auto-approve
  '''
}
