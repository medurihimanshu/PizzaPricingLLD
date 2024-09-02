package pizza;

public class Margherita implements Pizza {

    @Override
    public String getDescription() {
        return "Margherita Pizza";
    }

    @Override
    public double getOverallCost() {
        return 150;
    }
}
