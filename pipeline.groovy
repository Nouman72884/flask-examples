pipelineJob("flask_app_demo") {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url("https://github.com/Nouman72884/flask-examples.git")
            credentials("github-credentials")
          }
          branch('master')
        }
      }
      scriptPath("jenkinsfile")
    }
  }
}
