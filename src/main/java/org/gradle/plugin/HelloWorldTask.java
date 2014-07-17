package org.gradle.plugin;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class HelloWorldTask extends DefaultTask {

    @TaskAction
    public void doHelloWorld() {
        System.out.println("Hello World!");
    }
}
