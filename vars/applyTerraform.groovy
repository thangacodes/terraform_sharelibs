def apply(){
  echo "Terraform apply with auto approval in progress"
  sh 'terraform apply --auto-approve'
}
