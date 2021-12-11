pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                    sh './mvnw clean compile'
            }
        }

        stage ('Testing Stage') {

            steps {
                    sh './mvnw test'
            }
        }

//
//         stage ('Deployment Stage') {
//             steps {
//                     sh './mvn deploy'
//             }
//         }
    }
}