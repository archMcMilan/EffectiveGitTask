package task;

public class Main {

    public static void main(String[] args) {
        System.out.println("First tasks");
        System.out.println("Second commit");
        SomeRunner someRunner = new SomeRunner();
        someRunner.run();
        someRunner.generateIdByName("c");
    }
}
