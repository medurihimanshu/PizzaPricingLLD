import java.util.Arrays;
import java.util.stream.Stream;
import pizza.Farmhouse;
import pizza.Margherita;
import pizza.Pizza;
import pizzadecorator.CheeseDecorator;
import pizzadecorator.OliveDecorator;

public class PizzaPricing {
    public static void main(String[] args) {
        final Pizza basePizza = new Farmhouse();
        final Pizza cheeseFarmhousePizza = new CheeseDecorator(basePizza);
        final Pizza oliveCheeseMargheritaPizza = new OliveDecorator(new CheeseDecorator(new Margherita()));

        Stream.of(basePizza, cheeseFarmhousePizza, oliveCheeseMargheritaPizza)
                .forEach(pizza -> System.out.println(pizza.getDescription() + " price - " + pizza.getOverallCost()));
    }
}