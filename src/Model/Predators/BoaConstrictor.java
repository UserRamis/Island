package Model.Predators;

import Model.Predator;

public class BoaConstrictor extends Predator {


    public String name= "BoaConstrictor";
    public String icon = "🐍";
    public int weight = 400;
    public int maximumQuantity=50;
    public int speed=2;
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
