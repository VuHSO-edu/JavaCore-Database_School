package animal1_7;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public Dog() {
        super("Dog");
    }
    @Override
    public void greeting() {
        System.out.println("Woof");
    }

    public void greeting(Dog another) {
        System.out.println("Woooof");
    }
}
