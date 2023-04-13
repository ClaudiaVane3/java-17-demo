package yuting.demo.var;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

public class DemoVar {
    public static void main(String[] args) {
        // general usage:
        var demoMap = new HashMap<Integer, String>();
        demoMap.put(1, "good morning.");
        demoMap.put(2, "good afternoon.");
        demoMap.put(3, "good evening.");
        System.out.println(demoMap);

        var clazz = new RandomClassWithRatherTediousName();
        clazz.name = "test";
        System.out.println(clazz.getProperty());

        // possible to use the var in lambda expressions when args needs annotations: (@NonNull var str)
        var stringList = Arrays.asList("Presentation", "by", "Claudia");
        boolean containsLetterC = stringList.stream().anyMatch((var str) -> str.contains("C"));
        System.out.println("containsLetterC: " + containsLetterC);

        // possible to use in enhancement and traditional for loop:
        for (var str : stringList) {
            System.out.println(str);
        }
        for (var i = 0; i < 3; i++) {
            System.out.println("index: " + i);
        }

        // possible to use try-with-resources blocks
        try (var file = new FileInputStream("no-such-file")) {
            new BufferedReader(new InputStreamReader(file)).lines().forEach(System.out::println);
        } catch (IOException e) {
            // at least, we tried
            System.out.println("There's actually no `no-such-file`. :)");
        }

        // not possible to assign a lambda(functional interface) to a variable using var:
        // var name = RandomOneWithTediousName::getProperty;
    }
}

class RandomClassWithRatherTediousName {
    String name;

    public String getProperty() {
        return this.name;
    }
}