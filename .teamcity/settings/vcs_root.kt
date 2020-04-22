import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object ExampleRepository : GitVcsRoot({
    id("examplevcs")
    name = "example-repository"
    url  = "https://github.com/tombuildsstuff/example-repository.git"
})