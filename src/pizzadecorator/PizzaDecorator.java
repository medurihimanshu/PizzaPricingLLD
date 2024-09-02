package pizzadecorator;

import pizza.Pizza;

public abstract class PizzaDecorator implements Pizza {
    protected final Pizza basePizza;

    protected PizzaDecorator(Pizza basePizza) {
        this.basePizza = basePizza;
    }
}
