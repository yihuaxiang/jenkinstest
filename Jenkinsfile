pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'mvn clean package'
                sh 'kill -9 `ps aux | grep java | grep firstjob | awk "{print $2}"`'
                sh 'java -jar target/firstjob-0.0.1-SNAPSHOT.jar > out.file 2>&1 &'
            }
        }
    }
}

