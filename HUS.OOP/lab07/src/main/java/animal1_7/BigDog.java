package animal1_7;

public class BigDog extends Dog {

    public BigDog(String name) {
        super(name);
    }
    public BigDog() {
        super("BigDog");
    }

    @Override
    public void greeting() {
        System.out.println("Woow");
    }

    @Override
    public void greeting(Dog another) {
        System.out.println("Woooooooooow");
    }

    public void greeting(BigDog another) {
        System.out.println("Woooooow");
    }
}
