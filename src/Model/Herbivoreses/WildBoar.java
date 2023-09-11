package Model.Herbivoreses;

import Model.Herbivores;
import Model.Predator;

public class WildBoar extends Herbivores {


    public String name= "WildBoar";
    public String icon = "🐗";
    public int weight = 50;
    public static int maximumQuantity=30;
    public int speed=2;
    public double maximumFood=15;


    @Override
    protected int getWeight() {
        return getWeight();
    }

    @Override
    protected int maximumQuantity() {
        return maximumQuantity;
    }

    @Override
    protected String getIcon() {
        return icon;
    }

    @Override
    protected double getSpeed() {
        return speed;
    }

    @Override
    protected double getMaximumFood() {
        return maximumFood;
    }
}
