def call(){
  echo "Terraform state refresh will happen where the tf state file existing path.."
  sh '''
     cd infraiac/user_account
     terraform refresh
     '''
}
