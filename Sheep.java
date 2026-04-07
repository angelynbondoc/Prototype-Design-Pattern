public class Sheep implements Animal{
    private int legs;
    private String sound;
    private String food;
    private String name;

    public Sheep() {
        this.legs = 4;
        this.sound = "Baa";
        this.food = "Grass";
        this.name = "John Lloyd";
    }

    public Sheep(Sheep sheep) {
        this.legs = sheep.legs;
        this.sound = sheep.sound;
        this.food = sheep.food;
        this.name = sheep.name;
    }

    @Override
    public Animal clone() {
        return new Sheep(this);
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String getType() {
        return "Sheep";
    }

    public int getLegs() {
        return legs;
    }

    public String getSound() {
        return sound;
    }

    public String getFood() {
        return food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}