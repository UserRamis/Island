package Board;

import Factory.Enums.AnimalTypes;
import Factory.Enums.HerbivoresTypes;
import Factory.Enums.PredatorsTypes;
import Factory.HerbivoresesCreator;
import Factory.PredatorsCreator;
import Model.Animal;
import Model.Herbivoreses.Buffalo;
import Model.Plant;
import Model.Plants.Grass;
import Model.Predators.Wolf;

import java.lang.reflect.Field;
import java.util.*;

import java.util.ArrayList;


public class Square{
    private static final Random random = new Random();

    public static List<Animal> predatorsList=new ArrayList<>();
    public static List<Animal> herbivoresList=new ArrayList<>();

    public static List<Plant> plant=new ArrayList<>();

    public static HashMap<AnimalTypes,Integer> animalCount=new HashMap<>();

    public static PredatorsCreator predatorsCreator=new PredatorsCreator();
    public static HerbivoresesCreator herbivoresesCreator=new HerbivoresesCreator();





    public static void createAnimal(int n)
    {
        for (int i = 0; i < n; i++)
        {
            AnimalTypes type=getRandomType(true);

            predatorsList.add(predatorsCreator.createAnimal(type));

            animalCount.put(type,animalCount.getOrDefault(type,0)+1);
            type=getRandomType(false);
            herbivoresList.add(herbivoresesCreator.createAnimal(getRandomType(false)));

            animalCount.put(type,animalCount.getOrDefault(type,0)+1);
        }
    }

    public static AnimalTypes getRandomType(boolean isPredator)//выбираем хищника или травоядного
    {
        AnimalTypes[] predatorTypes = {PredatorsTypes.BEAR, PredatorsTypes.BOACONSTRICTOR, PredatorsTypes.EAGLE,
                PredatorsTypes.FOX, PredatorsTypes.WOLF};

        AnimalTypes[] herbivoreTypes = {HerbivoresTypes.BUFFALO, HerbivoresTypes.CATERPILLAR, HerbivoresTypes.DEER,
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







