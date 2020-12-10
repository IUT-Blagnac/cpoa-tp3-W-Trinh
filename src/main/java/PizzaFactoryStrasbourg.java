
public class PizzaFactoryStrasbourg extends PizzaFactory{
	private static PizzaFactory instance = new PizzaFactoryStrasbourg();
	
	private PizzaFactoryStrasbourg() {
		
	}
	
	public static PizzaFactory getInstance(){
		return instance;
	}
	
	@Override
	protected Pizza creerPizza(String type) {
		switch(type){
		case "fromage" :
			return new PizzaFromageStyleStrasbourg();
		case "grecque" :
			return new PizzaGrecqueStyleStrasbourg();
		case "poivrons":
			return new PizzaPoivronsStyleStrasbourg();
		default : 
			return new PizzaClassique();
			
		}
	}

}
