def call() {
  pipeline {
    agent any
    stages { 
      stage('in main') {
        steps {
          echo 'Hello from main'
        }
      }
      stage('in main, call function1') {
        steps {
          function1('my_main')
        }
      }
    }
  }
}
