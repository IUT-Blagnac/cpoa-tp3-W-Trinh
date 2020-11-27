
public class PizzaFactoryStrasbourg extends PizzaFactory{
	private static PizzaFactory instance = new PizzaFactoryStrasbourg();
	
	private PizzaFactoryStrasbourg() {
		
	}
	
	public static PizzaFactory getInstance(){
		return instance;
	}
	
	@Override
	protected Pizza creerPizza(String type) {
		
		if (type.equals("fromage")) {
			return new PizzaFromageStyleStrasbourg();
		} else if (type.equals("grecque")) {
			return new PizzaGrecqueStyleStrasbourg();
		} else {
			return new PizzaPoivronsStyleStrasbourg();
		}
	}

}
