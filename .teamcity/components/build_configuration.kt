import jetbrains.buildServer.configs.kotlin.v2019_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2019_2.Id
import jetbrains.buildServer.configs.kotlin.v2019_2.RelativeId
import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.golang
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object ExampleConfiguration : BuildType({
    id("exampleconfig")
    name = "Example Configuration"
    vcs {
        root(rootId = RelativeId("ExampleRepository_HttpsGithubComTombuildsstuffExampleRepositoryGitRefsHeadsMaster"))
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