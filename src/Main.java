public class Main {
    public static void main(String[] args) {

        Pet p1 = new Pet("Apollo", "Dog", 2, 5);
        Pet p2 = new Pet("Stella", "Cat", 1, 2);

        System.out.print("There is a " + p1.getSpecies().toLowerCase() + " named " + p1.getName() +
                " who is " + p1.getAge() + " years old and has a hunger level of " + p1.getHunger() + ". ");

        p1.play();
        System.out.print("After playing, " + p1.getName() + " becomes a bit hungrier, bringing the hunger level to " +
                p1.getHunger() + ". ");

        p1.feed();
        System.out.print("After being fed, the hunger level goes down to " + p1.getHunger() + ". ");

        p1.birthday();
        System.out.print("Later, " + p1.getName() + " celebrates a birthday and is now " + p1.getAge() +
                " years old. ");

        System.out.print("There is also a " + p2.getSpecies().toLowerCase() + " named " + p2.getName() +
                " who is " + p2.getAge() + " years old with a hunger level of " + p2.getHunger() + ". ");
    }
}
