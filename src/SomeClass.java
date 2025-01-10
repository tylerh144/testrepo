public class SomeClass {
    private int thing;

    public SomeClass(int x) {
        thing = x;
    }

    public int getThing() {
        return thing;
    }

    public void hello() {
        System.out.println("hello, what's up");
    }

    public void funMethod() {
        for (int i = 0; i < Math.random()*100; i++) {
            System.out.println("fun");
        }
    }
}
