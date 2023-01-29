def tfinit() {
    echo 'building the application...'
} 

def tfplan() {
    echo 'testing the application...'
} 

def tfapply() {
    echo 'deplying the application...'
    echo "deploying version ${params.VERSION}"
} 

return this
