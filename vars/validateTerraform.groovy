def call(){
  echo "Terraform validate in progress.."
  sh '''
      cd terraform_sharelibs/user_account
      terraform validate
  '''
}
