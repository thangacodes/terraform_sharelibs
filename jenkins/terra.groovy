def tfinit() {
    echo 'terraform init in progress...'
    sh '''
         cd ec2_spinup
         pwd
         terraform init
       '''      
} 
def tffmt() {
    echo 'terraform format in progress...'
    sh '''
         cd ec2_spinup
         pwd
         terraform fmt
      '''
    
} 
def tfvalidate() {
    echo 'terraform validate in progress...'
    sh '''
          cd ec2_spinup
          pwd
          terraform validate
      '''
       
} 
def tfplan() {
    echo 'terraform plan in progress...'
    sh '''
         cd ec2_spinup
         pwd
         terraform plan
      '''
} 
return this
