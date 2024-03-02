def call(){
  echo "Terraform initialization in progress"
  sh '''
     cd terraform_sharelibs/ec2_spinup
     terraform init
  '''
}
