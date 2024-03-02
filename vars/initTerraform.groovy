def call(){
  echo "Terraform initialization in progress"
  sh '''
     cd terraform_sharelibs/user_account
     terraform init
  '''
}
