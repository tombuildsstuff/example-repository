import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object ExampleProject : Project({
    vcsRoot(ExampleRepository)
    buildType(ExampleConfiguration)
})