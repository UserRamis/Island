import Board.Square;
import service.CreatingMap;
import service.MoveToTheMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static int x,y;
    public static void main(String[] args) {

        try {

            System.out.print("Введите ширину острова(целое число): ");
            x = Integer.parseInt(reader.readLine());
            System.out.print("Введите длину острова(целое число): ");
            y = Integer.parseInt(reader.readLine());

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Неверный формат целого числа.");
        }

        CreatingMap creatingMap=new CreatingMap(x,y);

        Square[][] map=creatingMap.Creating();//создали нашу карту с разными типами и кол-важивотными
        System.out.println("Карта с животными "+x+" на "+y+" создана");
        new MoveToTheMap(map,2);

    }




}