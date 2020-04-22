import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object ExampleProject : Project({
    buildType(ExampleConfiguration)
    vcsRoot(ExampleRepository)
})