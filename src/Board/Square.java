package Board;

import Factory.Enums.AnimalTypes;
import Factory.Enums.HerbivoresTypes;
import Factory.Enums.PredatorsTypes;
import Factory.HerbivoresesCreator;
import Factory.PredatorsCreator;
import Model.Animal;
import Model.Herbivoreses.Buffalo;
import Model.Herbivoreses.Caterpillar;
import Model.Herbivoreses.Deer;
import Model.Herbivoreses.Duck;
import Model.Herbivoreses.Goat;
import Model.Herbivoreses.Horse;
import Model.Herbivoreses.Mouse;
import Model.Herbivoreses.Rabbit;
import Model.Herbivoreses.Sheep;
import Model.Herbivoreses.WildBoar;
import Model.Plant;
import Model.Plants.Grass;
import Model.Predators.Wolf;
import Model.Predators.Bear;
import Model.Predators.BoaConstrictor;
import Model.Predators.Eagle;
import Model.Predators.Fox;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

import java.util.ArrayList;

import static Factory.Enums.HerbivoresTypes.*;
import static Factory.Enums.PredatorsTypes.*;


public class Square{
    private static final Random random = new Random();

    public static List<Animal> predatorsList=new ArrayList<>();
    public static List<Animal> herbivoresList=new ArrayList<>();

    public static List<Plant> plant=new ArrayList<>();

    public static HashMap<AnimalTypes,Integer> animalCount=new HashMap<>();

    public static PredatorsCreator predatorsCreator=new PredatorsCreator();
    public static HerbivoresesCreator herbivoresesCreator=new HerbivoresesCreator();





    public static void createAnimal(int n) {
        for (int i = 0; i < n; i++) {
            AnimalTypes type = getRandomType(true);
            Animal predator = predatorsCreator.createAnimal(type);
            predatorsList.add(predator);
            animalCount.put(type, animalCount.getOrDefault(type, 0) + 1);

            // Вывести информацию о классе и поле maximumQuantity
            Class<?> animalClass = type.getAnimalClass();
            String className = animalClass.getSimpleName();
            try {
                Field maximumQuantityField = animalClass.getDeclaredField("maximumQuantity");
                maximumQuantityField.setAccessible(true);
                int maximumQuantityValue = maximumQuantityField.getInt(null); // Поле статическое, null для статических полей

                System.out.println("Created " + className + ", maximumQuantity: " + maximumQuantityValue);
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
            }



            type=null;
            type = getRandomType(false);
            Animal herbivores = predatorsCreator.createAnimal(type);
            herbivoresList.add(herbivoresesCreator.createAnimal(type));
            animalCount.put(type, animalCount.getOrDefault(type, 0) + 1);
        }
    }



    public static AnimalTypes getRandomType(boolean isPredator)//выбираем хищника или травоядного
    {
        AnimalTypes[] predatorTypes = {BEAR, PredatorsTypes.BOACONSTRICTOR, PredatorsTypes.EAGLE,
                PredatorsTypes.FOX, PredatorsTypes.WOLF};

        AnimalTypes[] herbivoreTypes = {BUFFALO, HerbivoresTypes.CATERPILLAR, HerbivoresTypes.DEER,
                HerbivoresTypes.DUCK, HerbivoresTypes.GOAT, HerbivoresTypes.HORSE, HerbivoresTypes.MOUSE,
                HerbivoresTypes.RABBIT, HerbivoresTypes.SHEEP, HerbivoresTypes.WILDBOAR};


        AnimalTypes[] selectedTypes = isPredator ? predatorTypes : herbivoreTypes;

        int randomIndex = random.nextInt(selectedTypes.length);

        AnimalTypes randomType = selectedTypes[randomIndex];

        return randomType;
    }

    public static void createPlant(int n)
    {
        for (int i = 0; i < n; i++) {
            plant.add(new Grass());
        }
    }

    public static int getAnimalCount(AnimalTypes types)
    {
        return animalCount.getOrDefault(types,0);
    }





}







