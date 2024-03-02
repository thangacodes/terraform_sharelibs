def call(){
  echo "Infra deletion begins shortly by Terraform..."
  sh '''
      cd terraform_sharelibs/user_account
      terraform destroy --auto-approve
  '''
