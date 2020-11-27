
public class PizzeriaStrasbourg extends Pizzeria {
private static Pizzeria instance = new PizzeriaStrasbourg();
	
	private PizzeriaStrasbourg() {
		
	}
	
	public static Pizzeria getInstance() {
		return instance;
	}
	
	@Override
	protected
	Pizza creerPizza(String type) {
		
		if (type.equals("fromage")) {
			return new PizzaFromageStyleStrasbourg();
		} else if (type.equals("grecque")) {
			return new PizzaGrecqueStyleStrasbourg();
		} else {
			return new PizzaPoivronsStyleStrasbourg();
		}
	}
	
}
