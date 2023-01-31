pipelineJob('jenkins/demo_testing'){
    logRotator {
        numToKeep(1)
    }

     parameters {
       choiceParam('Environment', ['DEV','UAT','STAGING'], 'Please select AWS_ENV to deploy the resources:')
       stringParam('branch', 'main', 'Please select the branch in which you keep the code.')
       stringParam('key_pair', 'admin', 'Enter the keypair name which will be used to access the instance.')
       stringParam('ami_id', 'ami-01a4f99c4ac11b03c', 'Enter the AMI id with which to use to spin up the instances')
       stringParam('SNOW_CR', 'CHG12045X', 'Enter a ServiceNow Change Number to proceed')
     }

    definition {
        cpsScm{
            scm{
                git{
                remote{
                    url('https://github.com/send2durai/terraform_sharelibs.git')
                    //credentials("")
                }
                branch('main')
                }
            }
            scriptPath('jenkins/demo.groovy')
        }
    }
}
