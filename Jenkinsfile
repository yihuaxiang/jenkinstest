pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'mvn clean package'
                sh 'kill -9 `pgrep java`'
                sh 'java -jar target/firstjob-0.0.1-SNAPSHOT.jar > out.file 2>&1 &'
            }
        }
    }
}
