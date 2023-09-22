package Model.Herbivoreses;

import Model.Animal;
import Model.Herbivores;
import Model.Organisms;
import Model.Plants.Grass;
import Model.Predator;
import Model.Predators.*;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class WildBoar extends Herbivores {


    public String name= "WildBoar";
    public String icon = "🐗";
    public int weight = 50;
    public static int maximumQuantity=30;
    public static int speed=2;
    public double maximumFood=15;

    public static Map<Class<?extends Organisms>,Integer> eatProbabilities=new HashMap<>();

    public WildBoar()
    {
        eatProbabilities.put(Wolf.class,0);
        eatProbabilities.put(BoaConstrictor.class,0);
        eatProbabilities.put(Fox.class,0);
        eatProbabilities.put(Bear.class,0);
        eatProbabilities.put(Eagle.class,0);
        eatProbabilities.put(Horse.class,0);
        eatProbabilities.put(Deer.class,0);
        eatProbabilities.put(Rabbit.class,0);
        eatProbabilities.put(Mouse.class,50);
        eatProbabilities.put(Goat.class,0);
        eatProbabilities.put(Sheep.class,0);
        eatProbabilities.put(WildBoar.class,0);
        eatProbabilities.put(Buffalo.class,0);
        eatProbabilities.put(Duck.class,0);
        eatProbabilities.put(Caterpillar.class,90);
        eatProbabilities.put(Grass.class,100);
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
