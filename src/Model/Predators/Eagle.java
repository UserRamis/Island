package Model.Predators;

import Model.Predator;

public class Eagle extends Predator {


    public String name= "Eagle";
    public String icon = "🦅";
    public int weight = 6;
    public static int maximumQuantity=20;
    public static int speed=3;
    public int maximumFood=1;

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
