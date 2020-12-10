/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public abstract class Pizzeria {
	public PizzaFactory factory;
	
	public Pizzeria(PizzaFactory factory) {
		this.factory = factory;
	}
	/**
	 * @param type
	 * @return a Pizza object according to the type
	 */
	public final Pizza commanderPizza(String type) {

		Pizza pizza = this.creerPizza(type);

		pizza.preparer();
		pizza.cuire();
		pizza.couper();
		pizza.emballer();

		return pizza;
	}
	
	protected Pizza creerPizza(String type) {
		return factory.creerPizza(type);
	}
}