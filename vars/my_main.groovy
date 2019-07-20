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
          function_1('my_main')
        }
      }
      stage('in main, call function2') {
        steps {
          function_2('my_main')
        }
      }
    }
  }
}
