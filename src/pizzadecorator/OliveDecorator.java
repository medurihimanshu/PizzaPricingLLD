package pizzadecorator;

import pizza.Pizza;

public class OliveDecorator extends PizzaDecorator {
    public OliveDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return this.basePizza.getDescription() + "| Olive topping";
    }

    @Override
    public double getOverallCost() {
        return this.basePizza.getOverallCost() + 10;
    }
}
