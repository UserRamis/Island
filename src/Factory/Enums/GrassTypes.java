package Factory.Enums;

import Model.Plants.Grass;

public enum GrassTypes implements AnimalTypes{
    GRASS(Grass.class);
    private final Class<?> animalClass;


    GrassTypes(Class<?> animalClass) {
        this.animalClass = animalClass;
    }

    public Class<?> getAnimalClass() {
        return animalClass;
    }
}
