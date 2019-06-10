def call(String name = "Jason") {
  pipeline {
    agent any
    stages { 
      stage('Example') {
        steps {
          log.info(name)
        }
      }
    }
  }
}
