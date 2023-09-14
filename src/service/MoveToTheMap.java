package service;

import Board.Square;
import Factory.Enums.AnimalTypes;

import java.util.HashMap;

public class MoveToTheMap
{

public MoveToTheMap(Square[][] squareMap, int time)
{
    for (int i = 0; i < squareMap.length; i++)
    {

        for (int j = 0; j < squareMap[i].length; j++)
        {
            Square square=squareMap[i][j];
            HashMap<AnimalTypes,Integer> animalCountMap=square.animalCount;
            animalCountMap.forEach((key, value) -> {
                System.out.println("Key: " + key + ", Value: " + value);
            });
        }
    }



}






}
