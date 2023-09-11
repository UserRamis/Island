package Model.Plants;

import Model.Plant;

public class Grass extends Plant
{

    public String name= "Grass";
    public String icon ="🌿";
    public int weight = 1;
    public static int maximumQuantity=200;


    @Override
    protected int getWeight() {
        return weight;
    }

    @Override
    protected int maximumQuantity() {
        return maximumQuantity;
    }

    @Override
    protected String getIcon() {
        return icon;
    }
}
