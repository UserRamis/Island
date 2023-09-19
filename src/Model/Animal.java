package Model;

public abstract class Animal extends Organisms implements Moveable
{
   protected abstract boolean tryToIt(Animal animal);

   protected abstract boolean willEat(int probability);
   protected abstract double getSpeed();

   protected abstract double getMaximumFood();



}
