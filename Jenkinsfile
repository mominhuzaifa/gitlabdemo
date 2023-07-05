pipeline{
	options{
	buildDiscarder(logRotator(numToKeepStr: '5', artifactnumToKeepStr: '5'))
	}

	agent any

	tools {maven 'maven_3.8.8'}

	stages{
		stage('code compilation'){
			steps{
			echo 'code compilation is starting'
			sh 'mvn clean compile'
			echo 'code compilation is completed'
			}
		}

		stage('code test'){
			steps{
			echo 'code testing is starting'
			sh 'mvn clean test'
			echo 'code testing is completed'
			}
		}

		stage('code package'){
			steps{
			echo 'code packaging is starting'
			sh 'mvn clean package'
			echo 'code packaging is completed'
			}
		}

	}
}