package Model.Predators;

import Model.Predator;

public class Wolf extends Predator {



    public String name= "Wolf";
    public String icon = "🐺";
    public int weight = 50;
    public static int maximumQuantity=30;
    public int speed=3;
    public int maximumFood=8;


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
