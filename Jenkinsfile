pipeline {
  agent any
  stages {
    stage('step1') {
      parallel {
        stage('step1') {
          steps {
            echo 'Pipelinetekhdem'
          }
        }

        stage('') {
          steps {
            warnError(message: 'erruer', catchInterruptions: true) {
              echo 'aa'
            }

          }
        }

      }
    }

    stage('step2') {
      steps {
        echo 'test'
      }
    }

  }
}