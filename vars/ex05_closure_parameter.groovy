def call(Closure body) {
  if (body) {
    println('with closure input')
    body.call() // invoke the code passed in as closure
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
