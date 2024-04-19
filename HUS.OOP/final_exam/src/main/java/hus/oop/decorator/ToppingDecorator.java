package hus.oop.decorator;

import hus.oop.decorator.Bread;

public abstract class ToppingDecorator extends Bread {
	Bread bread;
	
	public abstract String getDescription();

	public Bread getBread() {
		return this.bread;
	}
}
