package Model.Herbivoreses;

import Model.Herbivores;

public class Duck extends Herbivores {



    public String name= "Duck";
    public String icon = "🦆";
    public int weight = 1;
    public static int maximumQuantity=200;
    public int speed=1;
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
