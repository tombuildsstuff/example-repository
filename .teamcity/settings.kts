import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

version = "2019.2"

object PetclinicVcs : GitVcsRoot({
    name = "PetclinicVcs"
    url = "https://github.com/spring-projects/spring-petclinic.git"
})

project {
    vcsRoot(PetclinicVcs)
}