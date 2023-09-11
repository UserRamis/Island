package Model.Herbivoreses;

import Model.Herbivores;

public class Horse extends Herbivores {

    public String name= "Horse";
    public String icon = "🐎";
    public int weight = 400;
    public int maximumQuantity=20;
    public int speed=4;
    public int maximumFood=60;


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
