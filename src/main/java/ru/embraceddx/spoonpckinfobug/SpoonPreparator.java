package ru.embraceddx.spoonpckinfobug;
import spoon.Launcher;
import spoon.reflect.CtModel;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SpoonPreparator {

    public void buildModel(String sourcePath) {
        try {
            File localPath = Files.createDirectories(Paths.get("/tmp/test/out" + "/spoon_" + System.nanoTime())).toFile();

            Launcher launcher = new Launcher();
            launcher.addInputResource(sourcePath);
            launcher.setSourceOutputDirectory(localPath.getAbsolutePath());
            launcher.getEnvironment().setNoClasspath(true);
            launcher.getEnvironment().setCopyResources(false);
            launcher.run();
            CtModel model = launcher.getModel();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}