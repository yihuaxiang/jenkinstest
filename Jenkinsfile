pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'mvn clean package'
                sh '''
                    echo "handle old java process ... "
                    echo `ps aux | grep java | grep firstjob | grep -v jenkins`
                    pid=`ps aux | grep java | grep firstjob | grep -v jenkins | awk "{print $2}"`
                    echo "pid is $pid"

                    if [[ ! -z $pid ]]
                    then
                        echo "kill pid $pid"
                        kill -9 $pid
                    fi
                    echo "handle old process done"
                '''
                sh 'nohup java -jar target/firstjob-0.0.1-SNAPSHOT.jar &'
                sh '''
                    pid=`ps aux | grep java | grep firstjob | grep -v jenkins | awk "{print $2}"`
                    echo "java pid is $pid"
                '''
            }
        }
    }
}

