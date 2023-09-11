package Factory;

import Factory.Enums.AnimalTypes;
import Model.Animal;

public abstract class AnimalsCreator {

    public abstract Animal createAnimal(AnimalTypes type);
}
