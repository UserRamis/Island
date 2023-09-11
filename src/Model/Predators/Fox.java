package Model.Predators;

import Model.Predator;

public class Fox extends Predator {



    public String name= "Fox";
    public String icon = "🦊";
    public int weight = 8;
    public  static int  maximumQuantity=30;
    public int speed=2;
    public int maximumFood=2;

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
