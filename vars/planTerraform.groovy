def call(){
  echo "Terraform plan in progress.."
    sh '''
      cd terraform_sharelibs/ec2_spinup
      terraform plan
  '''
}
