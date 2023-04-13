package yuting.demo.records;

public class DemoRecord {

    // records declaration in a class
    public record range(int start, int end) {
    }

    // records declaration in a method
    public void test() {
        record range(int start, int end) {
        }
    }
}
