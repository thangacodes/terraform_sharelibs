def tfinit() {
    echo 'terraform init in progress...'
    sh 'terraform init'
} 
def tffmt() {
    echo 'terraform format in progress...'
    sh 'terraform fmt'
} 
def tfvalidate() {
    echo 'terraform validate in progress...'
    sh 'terraform valiadte'
} 
def tfplan() {
    echo 'terraform plan in progress...'
    sh 'terraform plan'
} 
return this
