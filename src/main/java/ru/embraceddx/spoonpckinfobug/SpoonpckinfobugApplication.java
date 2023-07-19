package ru.embraceddx.spoonpckinfobug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpoonpckinfobugApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpoonpckinfobugApplication.class, args);
        SpoonPreparator spoonPreparator = new SpoonPreparator();
        String sourcePath = "src/main/resources/buggedProject/src/main/java";
        spoonPreparator.buildModel(sourcePath);
    }

}
