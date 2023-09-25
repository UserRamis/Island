package Menu;

import Board.Square;
import Factory.Enums.AnimalTypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class MapCreationScreen {

    public static int x,y,z;
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public  MapCreationScreen()
    {
                try {
                    System.out.print("Введите ширину острова (целое число): ");
                    x = Integer.parseInt(reader.readLine());
                    System.out.print("Введите длину острова (целое число): ");
                    y = Integer.parseInt(reader.readLine());
                    System.out.print("Введите какое количетсво животных вы хотите разместить на одной клетке (целое число): ");
                    z=Integer.parseInt(reader.readLine());
                    reader.close();
                } catch (
                        IOException e) {
                    e.printStackTrace();
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: Неверный формат целого числа.");
                }
        System.out.println("Карта с животными " + x + " на " + y + " создана");
    }

    public static int getX()
    {
        return x;
    }
    public static int getY()
    {
        return y;
    }
    public static int getZ()
    {
        return z;
    }
    public void getAliveAnimals(Square[][] squareMap)
    {
        System.out.println("Список оставшихся в живых животных:");
                Square square=squareMap[1][1];
                HashMap<AnimalTypes,Integer> animalCountMap=square.animalCount;
                animalCountMap.forEach((key, value) -> {//перебор мапы

                    System.out.println("Животных "+key+" осталось "+value);

                });
            System.out.println();
    }
}
