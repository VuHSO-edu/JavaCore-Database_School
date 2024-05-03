package hus.oop.decorator;

public class Olives extends ToppingDecorator {
	public Olives(Bread bread) {
		this.bread = bread;
	}
 
	public String getDescription() {
		return bread.getDescription() + " + Olives";
	}
 
	public double cost() {
		return bread.cost() + 2.0;
	}

//	@Override
//	public String toString() {
//		/* TODO */
//	}


	@Override
	public String toString() {
		return "Olives{" +
				"bread=" + bread +
				", description='" + description + '\'' +
				'}';
	}
}
