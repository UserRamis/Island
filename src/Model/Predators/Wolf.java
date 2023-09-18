package Model.Predators;

import Model.Animal;
import Model.Herbivoreses.*;
import Model.Organisms;
import Model.Plants.Grass;
import Model.Predator;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Wolf extends Predator {



    public String name= "Wolf";
    public String icon = "🐺";
    public int weight = 50;
    public static int maximumQuantity=30;
    public static int speed=3;
    public int maximumFood=8;

    public static Map<Class<?extends Organisms>,Integer> eatProbabilities=new HashMap<>();

    public Wolf()
    {
        eatProbabilities.put(Wolf.class,0);
        eatProbabilities.put(BoaConstrictor.class,0);
        eatProbabilities.put(Fox.class,0);
        eatProbabilities.put(Bear.class,0);
        eatProbabilities.put(Eagle.class,0);
        eatProbabilities.put(Horse.class,10);
        eatProbabilities.put(Deer.class,15);
        eatProbabilities.put(Rabbit.class,60);
        eatProbabilities.put(Mouse.class,80);
        eatProbabilities.put(Goat.class,60);
        eatProbabilities.put(Sheep.class,70);
        eatProbabilities.put(WildBoar.class,15);
        eatProbabilities.put(Buffalo.class,10);
        eatProbabilities.put(Duck.class,40);
        eatProbabilities.put(Caterpillar.class,0);
        eatProbabilities.put(Grass.class,0);
    }

    public boolean tryToIt(Animal animal)
    {
        Integer probability=eatProbabilities.get(animal);
        if(probability!=null)
        {
            willEat(probability);
        }
        return false;
    }

    public boolean willEat(int probability)
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
