package Model.Herbivoreses;

import Model.Herbivores;

public class Caterpillar extends Herbivores {


    public String name= "Caterpillar";
    public String icon = "🐛";
    public int weight = 1;
    public int maximumQuantity=1000;
    public int speed=0;
    public int maximumFood=0;




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
