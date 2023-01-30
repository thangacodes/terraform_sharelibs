def tfinit() {
    echo 'terraform init in progress...'
    sh 'terraform init'
} 
def tfplan() {
    echo 'terraform plan in progress...'
} 
def tfapply() {
    echo 'terraform apply in progress...'
} 
return this
