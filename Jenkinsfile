pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'mvn clean package'
                sh '''
                    pid=`ps aux | grep java | grep firstjob | awk "{print $2}"`

                    if [[ ! -z $pid ]]
                    then
                        echo "kill pid $pid"
                        kill -9 $pid
                    fi
                '''
                sh 'java -jar target/firstjob-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}

