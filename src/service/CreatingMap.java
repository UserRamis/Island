package service;

import Board.Square;
import Model.Animal;
import Model.Organisms;

import java.util.Random;

public class CreatingMap
{
    Random random=new Random();
    public int x;
    public int y;
    public CreatingMap (int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    public Square[][] Creating()
    {
        Square squareMap[][]=new Square[x][y];
        for (int i = 0; i < squareMap.length; i++)
        {
            for (int j = 0; j <squareMap[i].length; j++)
            {
                Square square=new Square(5);
                squareMap[i][j]=square;
            }
        }
        return squareMap;
    }

}
