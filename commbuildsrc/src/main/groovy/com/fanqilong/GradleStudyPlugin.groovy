package com.fanqilong

import org.gradle.api.Plugin
import org.gradle.api.Project

class GradleStudyPlugin implements Plugin<Project> {

    /**
     * 插件被引用要执行的方法
     * @param project 引用当前插件的project
     */
    @Override
    void apply(Project project) {
        println "hello Plugin ${project.name}"
        // Configure project :app
        //hello Plugin app

        /**
         * 引用插件之后可以用通过 commBuildSrc 闭包传递参数
         */
        project.extensions.create('commBuildSrc',ReleaseInfoExtension)
    }
}