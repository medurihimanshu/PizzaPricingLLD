package pizzadecorator;

import com.sun.xml.internal.ws.util.StringUtils;
import pizza.Pizza;

public class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza basePizza) {
        super(basePizza);
    }

    @Override
    public String getDescription() {
        return String.join("|", this.basePizza.getDescription(), "Cheese topping");
    }

    @Override
    public double getOverallCost() {
        return this.basePizza.getOverallCost() + 5;
    }
}
