def call(){
  echo "Infra deletion begins shortly by Terraform..."
  sh '''
      cd terraform_sharelibs/ec2_spinup
      terraform destroy --auto-approve
  '''
