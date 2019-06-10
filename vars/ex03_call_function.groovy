def call(String name = "Jason") {
  pipeline {
    agent any
    stages { 
      stage('Example') {
        steps {
          echo "in ex03_call_function"
          script {
            log.info(name)
          }
        }
      }
    }
  }
}
