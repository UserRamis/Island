package Model.Herbivoreses;

import Model.Herbivores;

public class Rabbit extends Herbivores {

    public String name= "Rabbit";
    public String icon = "🐁";
    public int weight = 2;
    public static int maximumQuantity=150;
    public static int speed=2;
    public double maximumFood=0.45;


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
