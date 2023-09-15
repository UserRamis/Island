package Model.Predators;

import Model.Predator;

public class Bear extends Predator {

    public  String name= "Bear";
    public  String icon ="🐻";
    public  int weight = 500;
    public static int maximumQuantity=5;
    public static int speed=2;
    public  int maximumFood=80;

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
