variable "region" {
  type    = string
  default = "ap-south-1"
}
variable "tagging" {
  type = map(any)
  default = {
    #Name         = "SVC-ACCOUNT-${count.index}"
    Environment  = "DEV"
    CreationDate = "30/01/2023"
    Project      = "TF-IAM-ACCOUNT"
  }
}
