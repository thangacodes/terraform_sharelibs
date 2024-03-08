## Variables section
variable "region" {
  type        = string
  description = "Resources that will get provision on a particular region"
}

variable "projects" {
  type    = set(string)
  description = "Bucket names based on environment"
}
