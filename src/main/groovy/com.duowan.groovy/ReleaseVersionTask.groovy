package  com.duowan.groovy;
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction

class ReleaseVersionTask extends DefaultTask {
    //通过注解声明任务的输入和输出
    @Input Boolean release
    @OutputFile File destFile

    ReleaseVersionTask() {
        //在构造器里设置任务的分组和描述
        group = 'versioning'
        description = 'Makes project a release version.'
    }
    //通过注解声明要执行的任务
    @TaskAction
    void start() {
        project.version.release = true
        ant.propertyfile(file: destFile) {
            entry(key: 'release', type: 'string', operation: '=', value: 'true')
        }
    }
}