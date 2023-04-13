package yuting.demo.var;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoVarAAD {
    public static void main(String... args) {
        // back in Java 8
        List<RandomClassWithRatherTediousName> clazzList8 = new ArrayList<>();
        clazzList8 = new LinkedList<>();

        // Java 17: cross fingers that compiler infers List<yuting.demo.var.RandomClassWithRatherTediousName>
        var clazzList17 = new ArrayList<RandomClassWithRatherTediousName>();

        // clazzList17 = new LinkedList<>();
    }
}
