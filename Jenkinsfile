pipeline {
    agent any 
    stages {
        stage('Stage 1') {
            steps {
                echo 'Hello world again!'
                mvn clean install -DskipTests=true
            }
        }
    }
}
