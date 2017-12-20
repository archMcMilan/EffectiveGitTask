package task;

public class SomeRunner {
    private long id;
    private String name;

    public void run() {
        System.out.println("some runner has started");
    }

    public long generateIdByName(String name) {
        id = name.getBytes().length;
        return id;
    }
}
