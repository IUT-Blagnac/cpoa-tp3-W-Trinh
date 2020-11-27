
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
		switch(type){
		case "fromage" :
			return new PizzaFromageStyleBrest();
		case "grecque" :
			return new PizzaGrecqueStyleBrest();
		case "poivrons":
			return new PizzaPoivronsStyleBrest();
		default : 
			return new PizzaClassique();
			
		}
	}

}
