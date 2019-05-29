pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'mvn clean package'
                sh '''
                    echo "handle old java process ... "
                    xx='$2'
                    echo `ps aux | grep java | grep firstjob | grep -v jenkins`
                    pinfo=`ps aux | grep java | grep firstjob | grep -v jenkins`
                    echo "pinfo is $pinfo"

                    if [[ ! -z $pinfo ]]
                    then
                        echo "kill pid $pinfo"
                        kill -9 $pinfo
                    fi
                    echo "handle old process done"
                '''
                sh 'nohup java -jar target/firstjob-0.0.1-SNAPSHOT.jar &'
                sh '''
                    pid=`ps aux | grep java | grep firstjob | grep -v jenkins | awk "{print $xx}"`
                    echo "java pid is $pid"
                '''
            }
        }
    }
}

