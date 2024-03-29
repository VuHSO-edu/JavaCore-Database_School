package resizable_and_geometricobject;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle[Circle[radius=" + super.getRadius() + "]]";
    }

    @Override
    public void resize(int percent) {
        super.setRadius(super.getRadius() * percent / 100);
    }
}
