def call(){
  echo "Terraform validate in progress.."
  sh '''
      cd terraform_sharelibs/ec2_spinup
      terraform validate
  '''
}
