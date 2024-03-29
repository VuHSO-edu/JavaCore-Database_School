package animal;

public class BigDog extends  Dog {

    public BigDog(String name) {
        super(name);
    }
    public BigDog() {
        super("BigDog");
    }

    @Override
    public void greets() {
        System.out.println("Woow");
    }

    @Override
    public void greets(Dog another) {
        System.out.println("Woooooooooow");
    }

    public void greets(BigDog another) {
        System.out.println("Woooooow");
    }
}
