public class Cat extends Pet {

    public Cat(String name, int age, int hunger) {
        super(name, "Cat", age, hunger);
    }

    @Override
    public String getSound() {
        return "Meow";
    }
}
