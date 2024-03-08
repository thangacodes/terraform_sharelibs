### Creating S3_Bucket Resources using for_each method
resource "aws_s3_bucket" "bucket" {
  for_each = var.projects
  bucket   = each.value
}
