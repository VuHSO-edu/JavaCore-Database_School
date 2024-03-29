package animal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super("Cat");
    }
    @Override
    public void greets() {
        System.out.println("Meow");
    }
}
