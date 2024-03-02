def init(){
                echo "Terraform initialization in progress"
                sh '''
                pwd
                cd terraform_sharelibs/ec2_spinup
                pwd
                ls -lrt
                '''
}
