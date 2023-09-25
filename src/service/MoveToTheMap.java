package service;

import Board.Square;
import Factory.Enums.AnimalTypes;
import Factory.Enums.GrassTypes;
import Model.Plants.Grass;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Random;

public class MoveToTheMap
{
    Random random=new Random();
    private Square[][] squareMap;

public MoveToTheMap(Square[][] squareMap)
{
    this.squareMap=squareMap;
    //while (time!=0)
    {
        for (int i = 0; i < squareMap.length; i++)
        {
            for (int j = 0; j < squareMap[i].length; j++)
            {
                Square square=squareMap[i][j];
                HashMap<AnimalTypes,Integer> animalCountMap=square.animalCount;
                final int finalI = i;
                final int finalJ = j;
                animalCountMap.forEach((key, value) -> {

                    int animalSpeed=0;
                    Class<?> animalClass = key.getAnimalClass();
                    try {
                        Field animalSpeedField = animalClass.getDeclaredField("speed");
                        animalSpeedField.setAccessible(true);
                        animalSpeed = animalSpeedField.getInt(null);//получили скорость перемещения животного
                    } catch (NoSuchFieldException | IllegalAccessException e) {
                        e.printStackTrace();
                    }
                    int randomSpeed=random.nextInt(1,4);
                    if(randomSpeed<=animalSpeed)//удовлетворяет нашему условию животного
                    {
                        switch (randomSpeed)
                        {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                int cellsToMove=randomSpeed;
                                movementByCell(key,squareMap,finalI,finalJ,cellsToMove);
                                if(value>1)
                                {
                                    square.animalCount.put(key,value-1);
                                }
                                break;
                        }
                    }
                });
            }
        }
       // time--;


    }
    //System.out.println("Животные перешли на другие клетки!");
}

    public Square[][] getUpdatedMap() {
        return squareMap;
    }

    private static void movementByCell(AnimalTypes types, Square[][] squareMap, int i, int j, int cells) {
        if (j + cells < squareMap[i].length) {
            int newI = i; // Новая переменная для i
            if (i + cells < squareMap.length) {
                newI = i + cells;
            }
            Square square = squareMap[newI][j + cells];
            square.animalCount.put(types, square.animalCount.getOrDefault(types, 0) + 1);
        }
    }

}
