package service;

import Board.Square;
import Factory.Enums.AnimalTypes;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Random;


public class MoveToTheMap
{
    Random random=new Random();

public MoveToTheMap(Square[][] squareMap, int time)
{
    for (int i = 0; i < squareMap.length; i++)
    {

        for (int j = 0; j < squareMap[i].length; j++)
        {
            Square square=squareMap[i][j];
            HashMap<AnimalTypes,Integer> animalCountMap=square.animalCount;
            animalCountMap.forEach((key, value) -> {
                int animalSpeed=0;
                Class<?> animalClass = key.getAnimalClass();
                try {
                    Field animalSpeedField = animalClass.getDeclaredField("speed");
                    animalSpeedField.setAccessible(true);
                    animalSpeed = animalSpeedField.getInt(null);//получили скорость перемещения животного
                    System.out.println("животное " + key + ", value: " + value+"его скорость в классе"+animalSpeed);
                } catch (NoSuchFieldException | IllegalAccessException e) {
                    e.printStackTrace();
                }
                int randomSpeed=random.nextInt(5);
                if(randomSpeed<=animalSpeed)//удовлетворяет нашему условию животного
                {


                }





            });
        }
    }



}

public static void movementByOneCell(AnimalTypes type, Square square)
{
    
}
public static void movementByTwoCell(AnimalTypes type)
{

}

public static void movementByThreeCell(AnimalTypes type)
{

}

public static void movementByFourCell(AnimalTypes type)
{

}

}
