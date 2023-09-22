package Model.Predators;

import Model.Animal;
import Model.Herbivoreses.*;
import Model.Organisms;
import Model.Plants.Grass;
import Model.Predator;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Fox extends Predator {



    public String name= "Fox";
    public String icon = "🦊";
    public int weight = 8;
    public  static int  maximumQuantity=30;
    public static int speed=2;
    public int maximumFood=2;


    public static Map<Class<?extends Organisms>,Integer> eatProbabilities=new HashMap<>();

    public Fox()
    {
        eatProbabilities.put(Wolf.class,0);
        eatProbabilities.put(BoaConstrictor.class,0);
        eatProbabilities.put(Fox.class,0);
        eatProbabilities.put(Bear.class,0);
        eatProbabilities.put(Eagle.class,0);
        eatProbabilities.put(Horse.class,0);
        eatProbabilities.put(Deer.class,0);
        eatProbabilities.put(Rabbit.class,70);
        eatProbabilities.put(Mouse.class,90);
        eatProbabilities.put(Goat.class,0);
        eatProbabilities.put(Sheep.class,0);
        eatProbabilities.put(WildBoar.class,0);
        eatProbabilities.put(Buffalo.class,0);
        eatProbabilities.put(Duck.class,60);
        eatProbabilities.put(Caterpillar.class,40);
        eatProbabilities.put(Grass.class,0);
    }
    @Override
    public boolean tryToIt(Organisms organisms) {
        Integer probability = eatProbabilities.get(organisms.getClass());
        if (probability != null) {
            return willEat(probability);
        }
        return false;
    }
    @Override
    public  boolean willEat(int probability)
    {
        int randomValue= ThreadLocalRandom.current().nextInt(100);
        return randomValue<probability;
    }
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
