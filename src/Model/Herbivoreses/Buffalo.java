package Model.Herbivoreses;

import Model.Herbivores;

public class Buffalo extends Herbivores {


    public String name= "Buffalo";
    public String icon = "🐃";
    public int weight = 700;
    public static int maximumQuantity=10;
    public static int speed=3;
    public int maximumFood=100;




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
