def call(){
  echo "Infra deletion begins shortly by Terraform..."
  sh '''
      cd infraiac/user_account
      terraform destroy --auto-approve
  '''
