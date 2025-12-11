public class Pet {

    private int hunger;
    private String name;
    private String species;
    private int age;


    public Pet(String name, String species, int age, int hunger) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.hunger = hunger;
    }


    public void play() {
        hunger++;
    }

    public void feed() {
        hunger--;
        if (hunger < 0) {
            hunger = 0;
        }
    }


    public void birthday() {
        age++;
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getHunger() {
        return hunger;
    }


    public String toString() {
        return "Pet{name='" + name + "', species='" + species + "', age=" + age + ", hunger=" + hunger + "}";
    }
}
