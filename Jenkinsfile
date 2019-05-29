pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'mvn clean package'
                sh 'kill `ps axu | grep java | grep SNAPSHOT | awk "{print $2}"`'
                sh 'nohup java -jar target/firstjob-0.0.1-SNAPSHOT.jar &'
            }
        }
    }
}

