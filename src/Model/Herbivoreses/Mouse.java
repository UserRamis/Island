package Model.Herbivoreses;

import Model.Herbivores;

public class Mouse extends Herbivores {

    public String name= "Mouse";
    public String icon = "🐁";
    public double weight = 0.05;
    public int maximumQuantity=1;
    public int speed=3;
    public double maximumFood=0.02;


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
