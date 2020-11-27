import static org.junit.Assert.*;

import org.junit.Test;

public class PizzeriaTest {

    @Test
    public void anOrderedPizzaIsNotNull() {
        Pizzeria boutiqueBrest = new PizzeriaBrest();
        Pizza miam = boutiqueBrest.commanderPizza("fromage");
        assertNotNull("An Ordered Pizza Is Not Null",miam);
    }

    @Test
    public void twoOrderedPizzasAreDifferent() {
        Pizzeria boutiqueBrest = new PizzeriaBrest();
        Pizzeria boutiqueStrasbourg = new PizzeriaStrasbourg();
        Pizza miam1 = boutiqueBrest.commanderPizza("fromage");
        Pizza miam2 = boutiqueStrasbourg.commanderPizza ("grecque");
        assertNotEquals("Two Ordered Pizzas Are Different",miam1,miam2);
    }
    
    @Test
    public void twoFactoryAreTheSame() {
    	PizzaFactory brest1 = PizzaFactoryBrest.getInstance();
    	PizzaFactory brest2 = PizzaFactoryBrest.getInstance();
    	assertEquals("Two PizzaFactory are the same",brest1,brest2);
    }
    
    @Test 
    public void defaultCommand() {
    	Pizzeria boutique = new PizzeriaBrest();
    	Pizza miam = boutique.commanderPizza("");
    	assertNotNull("The default command is not null", miam);
    }
}