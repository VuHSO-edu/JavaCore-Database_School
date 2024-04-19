package hus.oop.decorator;
 import hus.oop.decorator.Bread;
import hus.oop.decorator.ToppingDecorator;
public class Olives extends ToppingDecorator {
	public Olives(Bread bread) {
		this.bread = bread;
	}
 
	public String getDescription() {
		return bread.getDescription() + ", Olives";
	}
 
	public double cost() {
		return bread.cost() + 2.0;
	}
}
