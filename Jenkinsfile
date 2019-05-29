pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'mvn clean package'
                sh 'java -jar target/firstjob-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}
