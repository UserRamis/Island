package Factory.Enums;

import Model.Herbivoreses.*;

public enum HerbivoresTypes implements AnimalTypes{
    BUFFALO(Buffalo.class),
    CATERPILLAR(Caterpillar.class),
    DEER(Deer.class),
    DUCK(Duck.class),
    GOAT(Goat.class),
    HORSE(Horse.class),
    MOUSE(Mouse.class),
    RABBIT(Rabbit.class),
    SHEEP(Sheep.class),
    WILDBOAR(WildBoar.class);

    private final Class<?> animalClass;

    HerbivoresTypes(Class<?> animalClass) {
        this.animalClass = animalClass;
    }

    public Class<?> getAnimalClass() {
        return animalClass;
    }
}
