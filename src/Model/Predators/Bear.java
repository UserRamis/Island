package Model.Predators;

import Model.Animal;
import Model.Herbivoreses.*;
import Model.Organisms;
import Model.Plants.Grass;
import Model.Predator;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Bear extends Predator {

    public  String name= "Bear";
    public  String icon ="🐻";
    public  int weight = 500;
    public static int maximumQuantity=5;
    public static int speed=2;
    public  int maximumFood=80;

    public static Map<Class<?extends Organisms>,Integer> eatProbabilities=new HashMap<>();

    public Bear()
    {
        eatProbabilities.put(Wolf.class,0);
        eatProbabilities.put(BoaConstrictor.class,80);
        eatProbabilities.put(Fox.class,0);
        eatProbabilities.put(Bear.class,0);
        eatProbabilities.put(Eagle.class,0);
        eatProbabilities.put(Horse.class,40);
        eatProbabilities.put(Deer.class,80);
        eatProbabilities.put(Rabbit.class,80);
        eatProbabilities.put(Mouse.class,90);
        eatProbabilities.put(Goat.class,70);
        eatProbabilities.put(Sheep.class,70);
        eatProbabilities.put(WildBoar.class,50);
        eatProbabilities.put(Buffalo.class,20);
        eatProbabilities.put(Duck.class,10);
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
