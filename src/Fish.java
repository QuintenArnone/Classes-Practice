public class Fish extends Pet {

    private int swimDistance;

    public Fish(String name, int age, int hunger) {
        super(name, "Fish", age, hunger);
        swimDistance = 0;
    }

    public void swim() {
        swimDistance += 5;
    }

    public int getSwimDistance() {
        return swimDistance;
    }

    @Override
    public void play() {
        // Fish don't play on land
    }

    @Override
    public String getSound() {
        return "Blub";
    }
}
