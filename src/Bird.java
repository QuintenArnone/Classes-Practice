public class Bird extends Pet {

    private int energy;

    public Bird(String name, int age, int hunger) {
        super(name, "Bird", age, hunger);
        energy = 5;
    }

    public void fly() {
        if (energy > 0) {
            energy--;
        }
    }

    public int getEnergy() {
        return energy;
    }

    @Override
    public String getSound() {
        return "Chirp";
    }
}
