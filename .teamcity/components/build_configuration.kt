import jetbrains.buildServer.configs.kotlin.v2019_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.golang
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script

object ExampleConfiguration : BuildType({
    id("exampleconfig")
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