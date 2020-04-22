import jetbrains.buildServer.configs.kotlin.v2019_2.RelativeId
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object ExampleRepository : GitVcsRoot({
    name = "example-repository"
    url = "https://github.com/tombuildsstuff/example-repository.git"
    agentCleanPolicy = AgentCleanPolicy.ALWAYS
    agentCleanFilesPolicy = AgentCleanFilesPolicy.ALL_UNTRACKED
    branchSpec = "+:refs/pull/*/merge"
    branch = "refs/heads/master"
    authMethod = anonymous()
})
