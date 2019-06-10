def call(String name = "Jason") {
  pipeline {
    agent any
    stages { 
      stage('Example') {
        steps {
          echo "Hi, ${name}" 
        }
      }
    }
  }
}
