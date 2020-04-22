package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.golang
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

version = "2019.2"

project {
    vcsRoot(ExampleRepository)
    buildType(ExampleConfiguration)
}

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
