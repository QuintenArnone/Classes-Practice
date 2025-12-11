public class Pet {

    private int hunger;
    private String name;
    private String species;
    private int age;

    private String favoriteFood = "treat"; // added
     
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

    public void feed(String food) { // added
        if (food.equals(favoriteFood)) { // added
            hunger -= 2; // added
        } else { // added
            hunger -= 1; // added
        } // added
        if (hunger < 0) hunger = 0; // added
    } // added

    public void birthday() {
        age++;
    }

    public void rename(String newName) { // added
        name = newName; // added
    } // added

    public String speak() { // added
        if (species.equals("Dog")) return "Woof!"; // added
        if (species.equals("Cat")) return "Meow!"; // added
        return "Sound!"; // added
    } // added

    public boolean isHungry() { // added
        return hunger > 5; // added
    } // added

    public String getMood() { // added
        if (hunger <= 2) return "Happy"; // added
        if (hunger <= 5) return "Fine"; // added
        return "Grumpy"; // added
    } // added

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
