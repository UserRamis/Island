package service;

import Board.Square;
import Factory.Enums.AnimalTypes;
import Factory.Enums.GrassTypes;
import Factory.Enums.HerbivoresTypes;
import Factory.Enums.PredatorsTypes;
import Model.Animal;
import Model.Organisms;
import Model.Plants.Grass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static Factory.Enums.HerbivoresTypes.BUFFALO;
import static Factory.Enums.PredatorsTypes.BEAR;

public class EatingToTheMap {

   private static Random random=new Random(100);

    public EatingToTheMap(Square[][] squareMap, int time)
    {








        for (int i = 0; i < squareMap.length; i++)
        {
            for (int j = 0; j < squareMap[i].length; j++)
            {
                Square square=squareMap[i][j];
                HashMap<AnimalTypes,Integer> animalCountMap=square.animalCount;
                animalCountMap.forEach((key, value) ->{//перебор мапы
                    if(key.equals(GrassTypes.GRASS))//проверка если это трава, то она есть ничего не может
                    {
                        return;
                    }
                    //System.out.println(key);
                    //System.out.println(value);

                    if(value>0)//проверка есть ли наше животное
                    {
                        Class<?> animalClass = key.getAnimalClass();
                        try {
                            Object animalInstance = animalClass.newInstance();//текущее животное

                            AnimalTypes randomType = getRandomType();//рандомное животное, которое будет(или нет) сьедено)


                            Object randomAnimalInstance = randomType.getAnimalClass().newInstance();//обьект рандомного животного




                            Integer animalCount = animalCountMap.get(randomType);
                            if (animalCount != null && animalCount > 0) //проверка на то что РАНДОМНОЕ животное есть в квадрате
                            {
                                Grass grass=new Grass();

                                Method method=animalClass.getDeclaredMethod("tryToIt", Organisms.class);
                                method.setAccessible(true);
                                boolean m = (boolean) method.invoke(animalInstance, randomAnimalInstance);//сьест или нет животное
                                boolean mgracc=(boolean) method.invoke(animalInstance,grass);//сьест траву
                                if(m==true)
                                {
                                    animalCountMap.put(randomType,animalCountMap.get(randomType)-1);
                                    System.out.println("Животное "+randomAnimalInstance +" было сьедено и удалено!");
                                }
                                System.out.println("Сьест ли животное "+ animalClass +" траву? "+mgracc);
                                System.out.println("Животное "+animalClass +" ест животного "+randomType+"  "+m);
                            }



                        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException |
                                 InstantiationException e) {
                            e.printStackTrace();
                        }
                    }
                    else System.out.println("Животного "+key+" нет!");


                });



            }
        }





    }


    public static AnimalTypes getRandomType()//получаем рандомного животного
    {
        AnimalTypes[] Types = {BEAR, PredatorsTypes.BOACONSTRICTOR, PredatorsTypes.EAGLE,
                PredatorsTypes.FOX, PredatorsTypes.WOLF,BUFFALO, HerbivoresTypes.CATERPILLAR, HerbivoresTypes.DEER,
                HerbivoresTypes.DUCK, HerbivoresTypes.GOAT, HerbivoresTypes.HORSE, HerbivoresTypes.MOUSE,
                HerbivoresTypes.RABBIT, HerbivoresTypes.SHEEP, HerbivoresTypes.WILDBOAR};


        int randomIndex = random.nextInt(Types.length);
        AnimalTypes randomType = Types[randomIndex];
        return randomType;
    }



}
