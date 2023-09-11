package Model.Herbivoreses;

import Model.Herbivores;

public class Deer extends Herbivores {

    public String name= "Deer";
    public String icon = "🦌";
    public int weight = 300;
    public int maximumQuantity=20;
    public int speed=3;
    public int maximumFood=50;


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
