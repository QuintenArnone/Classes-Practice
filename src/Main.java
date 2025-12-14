public class Main {
        public static void main(String[] args) {
    
            Pet dog = new Dog("Apollo", 2, 5);
            Pet cat = new Cat("Stella", 1, 2);
            Pet chameleon = new Chameleon("Echo", 3, 4);
            Pet bird = new Bird("Sky", 2, 3);
            Pet fish = new Fish("Bubbles", 1, 1);
            Pet snake = new Snake("Slither", 4, 2);
    
            System.out.print("There is a dog named " + dog.getName() +
                    " who is " + dog.getAge() + " years old with a hunger level of " +
                    dog.getHunger() + ". ");
    
            dog.play();
            System.out.print("After playing, " + dog.getName() +
                    " gets a bit hungrier, raising the hunger level to " +
                    dog.getHunger() + ". ");
    
            dog.feed();
            System.out.print("After being fed, the hunger level drops to " +
                    dog.getHunger() + ". ");
    
            dog.birthday();
            System.out.print(dog.getName() +
                    " celebrates a birthday and is now " +
                    dog.getAge() + " years old. ");
    
            System.out.print(dog.getName() + " says " + dog.getSound() + ". ");
    
            System.out.print("There is also a cat named " + cat.getName() +
                    " who is " + cat.getAge() + " years old with a hunger level of " +
                    cat.getHunger() + ", and " + cat.getName() +
                    " says " + cat.getSound() + ". ");
    
            Chameleon camo = (Chameleon) chameleon;
            System.out.print("There is a chameleon named " + camo.getName() +
                    " who can change color and is currently " +
                    camo.getColor() + ". ");
    
            Bird b = (Bird) bird;
            b.fly();
            System.out.print("There is a bird named " + b.getName() +
                    " who can fly and now has an energy level of " +
                    b.getEnergy() + ". ");
    
            Fish f = (Fish) fish;
            f.swim();
            System.out.print("There is a fish named " + f.getName() +
                    " who enjoys swimming and has now swum " +
                    f.getSwimDistance() + " units. ");
    
            Snake s = (Snake) snake;
            s.shedSkin();
            System.out.print("There is a snake named " + s.getName() +
                    " who has shed its skin " +
                    s.getSheds() + " time. ");
        }
    }
    