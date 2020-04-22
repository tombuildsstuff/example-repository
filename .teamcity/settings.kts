package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.golang
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script

object ExampleRepository : GitVcsRoot({
  name = "example-repository"
  url  = "https://github.com/tombuildsstuff/example-repository.git"
})

object ExampleConfiguration : BuildType({
  name = "Example Configuration"
  vcs {
    root(ExampleRepository)
    cleanCheckout = true
  }

  steps {
    script {
      name = "Run Go Tests"
      scriptContent = "go test -json -v ."
    }
  }

  failureConditions {
    errorMessage = true
  }

  features {
    golang {
      testFormat = "json"
    }
  }
})
