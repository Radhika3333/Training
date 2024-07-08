Start Function

import boto3
region = 'ap-northeast-1'
instances = []
ec2=boto3.cient('ec2' , region_name=region)
 
def lambda_handler(event, content):
    ec2.start_instances(InstanceIds=instances)
    print('start your instances: ' + str(instances))
	
=====================================================
Stop Function	

import boto3
region = 'ap-northeast-1'
instances = []
ec2=boto3.cient('ec2' , region_name=region)
 
def lambda_handler(event, content):
    ec2.stop_instances(InstanceIds=instances)
    print('stopped your instances: ' + str(instances))
