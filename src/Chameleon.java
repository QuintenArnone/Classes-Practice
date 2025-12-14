import java.util.Random;

public class Chameleon extends Pet {

    private String color;

    public Chameleon(String name, int age, int hunger) {
        super(name, "Chameleon", age, hunger);
        generateRandomColor();
    }

    public void generateRandomColor() {
        String[] colors = {"Red", "Blue", "Green", "Yellow", "Orange", "Purple", "Pink", "Brown", "Black", "White", "Gray", "Cyan", "Magenta", "Lime", "Teal", "Turquoise", "Navy", "Maroon", "Olive", "Mint", "Lavender", "Violet", "Indigo", "Crimson", "Scarlet", "Coral", "Salmon", "Peach", "Gold", "Silver", "Bronze", "Beige", "Tan", "Ivory", "Cream", "Charcoal", "Slate", "Steel", "Azure", "Cerulean", "Sky Blue", "Midnight Blue", "Forest Green", "Emerald", "Jade", "Sage", "Moss", "Chartreuse", "Mustard", "Amber", "Honey", "Copper", "Rust", "Mahogany", "Chocolate", "Coffee", "Espresso", "Sand", "Khaki", "Plum", "Eggplant", "Mulberry", "Rose", "Blush", "Fuchsia", "Hot Pink", "Neon Green", "Electric Blue", "Ice Blue", "Arctic White", "Smoke", "Ash", "Pearl", "Opal", "Onyx", "Obsidian", "Quartz", "Sapphire", "Ruby", "Topaz", "Amethyst", "Aquamarine", "Periwinkle", "Denim", "Ultramarine", "Prussian Blue", "Seafoam", "Pistachio", "Wasabi", "Burgundy", "Wine", "Brick", "Blood Red", "Fire Engine Red", "Sunset Orange", "Tangerine", "Apricot", "Lemon", "Canary Yellow", "Banana", "Butter", "Wheat", "Oat", "Mocha", "Latte", "Cappuccino", "Caramel", "Butterscotch", "Toffee", "Licorice", "Ink", "Oil Black", "Gunmetal", "Iron", "Aluminum", "Chrome", "Platinum", "Rose Gold", "Antique Gold", "Neon Purple", "Neon Pink", "Neon Yellow", "Neon Orange", "Glow Green", "Laser Blue", "Void Black", "Frost White", "Storm Gray", "Thunder Blue", "Cosmic Purple", "Galaxy Blue", "Nebula Pink", "Meteor Gray", "Alien Green", "Cyber Teal", "Digital Magenta", "Synthwave Pink", "Retro Cyan", "Vaporwave Purple", "Hologram Silver", "Iridescent Pearl"}; //few colors
        Random rand = new Random();
        color = colors[rand.nextInt(colors.length)];
    }

    public String getColor() {
        return color;
    }

    @Override
    public String getSound() {
        return "...";
    }
}
