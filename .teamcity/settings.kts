package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2019_2.project
import jetbrains.buildServer.configs.kotlin.v2019_2.version
//import settings.ExampleProject

version = "2019.2"

//project(ExampleProject)

BuildType {
    name = "Hello"
}