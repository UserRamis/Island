import Board.Square;
import Menu.MapCreationScreen;
import service.CreatingMap;
import service.EatingToTheMap;
import service.MoveToTheMap;


public class Main {

   private static Square[][] map;

    public static void main(String[] args) {
        MapCreationScreen mapCreationScreen=new MapCreationScreen();
        CreatingMap creatingMap = new CreatingMap(MapCreationScreen.getX(), MapCreationScreen.getY());
        map = creatingMap.Creating(MapCreationScreen.getZ());
        for (int i = 0; i < 3; i++) {
            new EatingToTheMap(map, 5);
            new MoveToTheMap(map);
        }
        mapCreationScreen.getAliveAnimals(map);


    }
}