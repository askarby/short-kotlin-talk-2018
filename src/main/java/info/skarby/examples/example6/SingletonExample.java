package info.skarby.examples.example6;

public class SingletonExample {

    public static void main(String[] args) {
        Counter instance = Counter.getInstance();
        for (int i = 0; i < 10; i++) {
            System.out.println(instance.increment());
        }
    }

}

class Counter {
    private static Counter INSTANCE = null;
    private int count = 0;

    private synchronized static void createInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Counter();
        }
    }

    public static Counter getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Counter();
        }
        return INSTANCE;
    }

    public int increment() {
        return ++count;
    }
}
