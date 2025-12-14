public class Snake extends Pet {

    private int sheds;

    public Snake(String name, int age, int hunger) {
        super(name, "Snake", age, hunger);
        sheds = 0;
    }

    public void shedSkin() {
        sheds++;
    }

    public int getSheds() {
        return sheds;
    }

    @Override
    public String getSound() {
        return "Hiss";
    }
}
