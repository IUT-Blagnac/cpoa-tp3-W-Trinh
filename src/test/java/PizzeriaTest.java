import static org.junit.Assert.*;

import org.junit.Test;

public class PizzeriaTest {

    @Test
    public void anOrderedPizzaIsNotNull() {
        Pizzeria boutiqueBrest = PizzeriaBrest.getInstance();
        Pizza miam = boutiqueBrest.commanderPizza("cheese");
        assertNotNull("An Ordered Pizza Is Not Null",miam);
    }

    @Test
    public void twoOrderedPizzasAreDifferent() {
        Pizzeria boutiqueBrest = PizzeriaBrest.getInstance();
        Pizzeria boutiqueStrasbourg = PizzeriaStrasbourg.getInstance();
        Pizza miam1 = boutiqueBrest.commanderPizza("cheese");
        Pizza miam2 = boutiqueStrasbourg.commanderPizza ("Greek");
        assertNotEquals("Two Ordered Pizzas Are Different",miam1,miam2);
    }
}