package Model.Herbivoreses;

import Model.Herbivores;

public class Sheep extends Herbivores {

    public String name= "Sheep";
    public String icon = "🐑";
    public int weight = 70;
    public int maximumQuantity=140;
    public int speed=3;
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
