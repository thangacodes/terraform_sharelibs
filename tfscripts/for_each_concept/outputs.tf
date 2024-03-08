### Outputs section
output "bucket_id" {
  value = values(aws_s3_bucket.bucket)[*].id
}
