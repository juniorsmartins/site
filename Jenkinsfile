pipeline {
    agent any
    stages{
        stage('Versões') {
            steps {
                echo "Java VERSION"
                sh 'java -version'

                echo "Maven VERSION"
                sh 'mvn -version'

                echo "Git VERSION"
                sh 'git --version'
            }
        }
        stage('Clone Repository') {
            steps {
                echo 'clonando repositório...'
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '19398882-7e87-40fa-b763-c4e0ae3e2c41', url: 'https://github.com/juniorsmartins/site']])
            }
        }
        stage('Build Maven Project') {
            steps {
                echo 'limpando e construíndo projeto'
                sh 'mvn clean install'
            }
        }
        stage('Tests') {
            steps {
                echo 'rodando testes automatizados'
                sh 'mvn test'
            }
        }
    }
}

