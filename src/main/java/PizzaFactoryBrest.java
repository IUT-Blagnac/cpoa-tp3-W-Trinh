
public class PizzaFactoryBrest extends PizzaFactory {
	private static PizzaFactory instance = new PizzaFactoryBrest();
	
	private PizzaFactoryBrest() {
		
	}
	
	public static PizzaFactory getInstance(){
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
