public class TestAnimal{
    public static void main(String []args){
        // Create the AnimalRegistry with default prototypes
        AnimalRegistry registry = new AnimalRegistry();

        // Create clones of animals using the registry
        System.out.println("=== Creating Animals using Prototype Pattern ===");
        
        Animal sheep1 = registry.createSheep();
        Animal sheep2 = registry.createSheep();
        Animal cow1 = registry.createCow();
        Animal horse1 = registry.createHorse();

        ((Sheep) sheep1).setName("Dolly");
        ((Cow) cow1).setSound("Moo!");
        ((Horse) horse1).setColor("Black");

        Animal sheep3 = registry.createSheep();
        ((Sheep) sheep3).setName("Molly");

        System.out.println(sheep1.getType() + " named " + ((Sheep) sheep1).getName());
        System.out.println(sheep2.getType() + " named " + ((Sheep) sheep2).getName());

        Animal cow2 = registry.createCow();
        ((Cow) cow2).setFood("Grass");
        System.out.println(cow2.getType() + " eats " + ((Cow) cow2).getFood());

        Animal horse2 = registry.createHorse();
        ((Horse) horse2).setColor("Brown");
        System.out.println(horse2.getType() + " is " + ((Horse) horse2).getColor());

        // Verify that sheep1 and sheep2 are different objects
        System.out.println("\n=== Verify Cloning (Different Objects) ===");
        System.out.println("sheep1 == sheep2: " + (sheep1 == sheep2));
        System.out.println("sheep1.equals(sheep2): " + (sheep1.equals(sheep2)));
        System.out.println("sheep1 class: " + sheep1.getClass().getName());
        System.out.println("sheep2 class: " + sheep2.getClass().getName());
    }
}