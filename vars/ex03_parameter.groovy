def call() {

  def opts = [
    name: 'what is your name'
  ]

  pipeline {
    agent any
    stages { 
      stage('Example') {
        steps {
          echo "Hi" 
        }
      }
    }
  }
}
