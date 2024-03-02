def call(){
  echo "Terraform apply with auto approval in progress"
    sh '''
      cd terraform_sharelibs/ec2_spinup
      terraform apply --auto-approve
  '''
}
