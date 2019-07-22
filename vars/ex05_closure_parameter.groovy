def call(Closure body) {
  if (body) {
    println('with closure input')
  } else {
    println('without closure input')
  }
  pipeline {
    agent any
    stages { 
      stage('Example') {
        steps {
          echo "test closure input" 
        }
      }
    }
  }
}
