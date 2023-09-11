package Model.Herbivoreses;

import Model.Herbivores;

public class Goat extends Herbivores {

    public String name= "Goat";
    public String icon = "🐐";
    public int weight = 60;
    public int maximumQuantity=40;
    public int speed=3;
    public int maximumFood=10;


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
