import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * 自定义task 实现维护版本信息的功能
 */
class ReleaseInfoTask extends DefaultTask {

    ReleaseInfoTask(){
        group = 'fanqilong'
        description = 'update release info'
    }

    /**
     * TaskAction注解的方法 整个方法执行在执行阶段
     * 执行于gradle 执行阶段的代码
     */
    @TaskAction
    void doAction(){
            updateInfo()
    }

    // 正真的将Extension类中的信息 写入到文件中
    private void  updateInfo(){
        // 获取将要写入的信息
        String vsersionCodeMsg = project.extensions.commBuildSrc.versionCode
        String vsersionNameMsg = project.extensions.commBuildSrc.versionName
        String vsersionInfoMsg = project.extensions.commBuildSrc.versionInfo
        String file = project.extensions.commBuildSrc.fileName
    }
}