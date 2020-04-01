pipeline {
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'				
            }
        }
        
		stage('Arduino') {
            steps {
				dir('p2/MyArduinoProject/src/FooProject/'){
					sh 'make'
				}
            }       
        }
        
        stage('Maven') {
            steps {
				dir('Practica3/Maven/simple/'){
					sh 'mvn compile'
					sh 'mvn test'
					sh 'mvn validate'
					sh 'mvn verify'
				}
            }       
        }
        
		stage('Android') {
            steps {
				dir('p2/GPI2_P2'){
					sh './gradlew task compileDebugAndroidTestSources'
					sh './gradlew task compileDebugSources'
					sh './gradlew task compileDebugUnitTestSources'
					sh './gradlew task compileReleaseSources'
					sh './gradlew task compileReleaseUnitTestSources'
				}
            }       
        }        
    }
}
