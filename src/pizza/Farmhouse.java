package pizza;

public class Farmhouse implements Pizza {

    @Override
    public String getDescription() {
        return "Farmhourse Pizza";
    }

    @Override
    public double getOverallCost() {
        return 100;
    }
}
