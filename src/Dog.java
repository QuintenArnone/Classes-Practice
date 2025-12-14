public class Dog extends Pet {

    public Dog(String name, int age, int hunger) {
        super(name, "Dog", age, hunger);
    }

    @Override
    public String getSound() {
        return "Woof";
    }
}
