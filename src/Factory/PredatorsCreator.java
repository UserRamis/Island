package Factory;

import Factory.Enums.AnimalTypes;
import Factory.Enums.PredatorsTypes;
import Model.Animal;
import Model.Predators.*;

import static Factory.Enums.PredatorsTypes.BOACONSTRICTOR;

public class PredatorsCreator extends AnimalsCreator
{
    @Override
    public Animal createAnimal(AnimalTypes type) {
        Animal predators=null;

        switch ((PredatorsTypes) type){
            case BEAR -> predators=new Bear();
            case BOACONSTRICTOR -> predators=new BoaConstrictor();
            case EAGLE -> predators=new Eagle();
            case FOX -> predators=new Fox();
            case WOLF -> predators=new Wolf();
        }
        return predators;
    }
}
