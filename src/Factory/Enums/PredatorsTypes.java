package Factory.Enums;

import Model.Predators.*;

public enum PredatorsTypes implements AnimalTypes {
    BEAR(Bear.class),
    BOACONSTRICTOR(BoaConstrictor.class),
    EAGLE(Eagle.class),
    FOX(Fox.class),
    WOLF(Wolf.class);


    private final Class<?> animalClass;

    PredatorsTypes(Class<?> animalClass) {
        this.animalClass = animalClass;
    }

    public Class<?> getAnimalClass() {
        return animalClass;
    }
}
