
public class PizzeriaBrest extends Pizzeria {
	private static Pizzeria instance = new PizzeriaBrest();
	
	private PizzeriaBrest() {
		
	}
	
	public static Pizzeria getInstance() {
		return instance;
	}
	
	@Override
	protected
	Pizza creerPizza(String type) {
		
		if (type.equals("fromage")) {
			return new PizzaFromageStyleBrest();
		} else if (type.equals("grecque")) {
			return new PizzaGrecqueStyleBrest();
		} else {
			return new PizzaPoivronsStyleBrest();
		}
	}

}
