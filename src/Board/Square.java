package Board;
import Factory.Enums.AnimalTypes;
import Factory.Enums.GrassTypes;
import Factory.Enums.HerbivoresTypes;
import Factory.Enums.PredatorsTypes;
import Factory.HerbivoresesCreator;
import Factory.PredatorsCreator;
import Model.Animal;
import Model.Plant;
import Model.Plants.Grass;
import java.lang.reflect.Field;
import java.util.*;
import java.util.ArrayList;
import static Factory.Enums.HerbivoresTypes.*;
import static Factory.Enums.PredatorsTypes.*;
import Factory.Enums.GrassTypes;


public class Square{
    private static final Random random = new Random();
    protected static List<Animal> predatorsList=new ArrayList<>();
    protected static List<Animal> herbivoresList=new ArrayList<>();
    protected static List<Plant> plant=new ArrayList<>();
    public static HashMap<AnimalTypes,Integer> animalCount=new HashMap<>();
    private static final PredatorsCreator predatorsCreator=new PredatorsCreator();
    private static final HerbivoresesCreator herbivoresesCreator=new HerbivoresesCreator();


    public Square(int n) {
        for (int i = 0; i < n; i++) {
            createPlant();
            boolean randomBoolean = random.nextBoolean();
            AnimalTypes type = getRandomType(randomBoolean);
            //System.out.println(type + " создан");
            int maximumQuantityPredatorValue = getMaximumQuantityValue(type);//ограничение животных класса
            Integer animalCountValue = animalCount.get(type);//мапа счетчик с животными
            if (animalCountValue != null && maximumQuantityPredatorValue <= animalCountValue.intValue()) {
                // Счетчик полный
            } else {
                if (type instanceof PredatorsTypes) {
                    createPredatorAnimal(type);
                } else {
                    createHerbivoresAnimal(type);
                }
            }
        }



    }

    public static void createPredatorAnimal(AnimalTypes type) {
        Animal predator = predatorsCreator.createAnimal(type);
        predatorsList.add(predator);
        animalCount.put(type, animalCount.get(type) != null ? animalCount.get(type) + 1 : 1);
        //System.out.println("животное "+type +" записано!");
    }

    public static int getMaximumQuantityValue(AnimalTypes type)
    {
        int maximumQuantityValue=0;
        Class<?> animalClass = type.getAnimalClass();
        try {
            Field maximumQuantityField = animalClass.getDeclaredField("maximumQuantity");
            maximumQuantityField.setAccessible(true);
            maximumQuantityValue = maximumQuantityField.getInt(null); // Поле статическое, null для статических полей
            //System.out.println("Created " + className + ", maximumQuantity: " + maximumQuantityValue+"количество их сейчас"+animalCount.get(type));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return maximumQuantityValue;
    }

    public static void createHerbivoresAnimal(AnimalTypes type) {
        Animal herbivore = herbivoresesCreator.createAnimal(type);
        herbivoresList.add(herbivore);
        animalCount.put(type, animalCount.get(type) != null ? animalCount.get(type) + 1 : 1);
        //System.out.println("животное "+type +" записано!");
    }

    public static AnimalTypes getRandomType(boolean isPredator) {
        AnimalTypes[] predatorTypes = {BEAR, PredatorsTypes.BOACONSTRICTOR, PredatorsTypes.EAGLE,
                PredatorsTypes.FOX, PredatorsTypes.WOLF};

        AnimalTypes[] herbivoreTypes = {BUFFALO, HerbivoresTypes.CATERPILLAR, HerbivoresTypes.DEER,
                HerbivoresTypes.DUCK, HerbivoresTypes.GOAT, HerbivoresTypes.HORSE, HerbivoresTypes.MOUSE,
                HerbivoresTypes.RABBIT, HerbivoresTypes.SHEEP, HerbivoresTypes.WILDBOAR};

        AnimalTypes[] allTypes = isPredator ? predatorTypes : herbivoreTypes;
        int randomIndex = random.nextInt(allTypes.length);
        AnimalTypes randomType = allTypes[randomIndex];
        return randomType;
    }


    public static void createPlant()
    {

            plant.add(new Grass());

        animalCount.put(GrassTypes.GRASS, plant.size() != 0 ? plant.size() + 1 : 1);
        //System.out.println("трава создана");
    }
}







