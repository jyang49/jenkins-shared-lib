def call() {
  pipeline {
    agent any
    stages { 
      stage('Example') {
        steps {
          echo 'Hello from shared library'
        }
      }
    }
  }
}
