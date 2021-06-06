package com.github.segersb.foobarintellijplugin.services

import com.github.segersb.foobarintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
