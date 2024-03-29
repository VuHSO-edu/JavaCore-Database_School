package animal1_7;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super("Cat");
    }
    @Override
    public void greeting() {
        System.out.println("Meow");
    }
}
