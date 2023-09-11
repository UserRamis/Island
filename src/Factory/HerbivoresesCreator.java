package Factory;

import Factory.Enums.AnimalTypes;
import Factory.Enums.HerbivoresTypes;
import Model.Animal;
import Model.Herbivores;
import Model.Herbivoreses.*;
import Model.Predators.Wolf;

public class HerbivoresesCreator extends AnimalsCreator
{

    @Override
    public Animal createAnimal(AnimalTypes type) {
        Animal herbivores=null;

        switch ((HerbivoresTypes) type)
        {
            case BUFFALO -> herbivores=new Buffalo();
            case CATERPILLAR -> herbivores=new Caterpillar();
            case DEER -> herbivores=new Deer();
            case DUCK -> herbivores=new Duck();
            case GOAT -> herbivores=new Goat();
            case HORSE -> herbivores=new Horse();
            case MOUSE -> herbivores=new Mouse();
            case RABBIT -> herbivores=new Rabbit();
            case SHEEP -> herbivores=new Sheep();
            case WILDBOAR -> herbivores=new WildBoar();
        }
        return herbivores;
    }
}
