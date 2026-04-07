public class Horse implements Animal{
    private int legs;
    private String sound;
    private String food;
    private String color;

    public Horse() {
        this.legs = 4;
        this.sound = "Neigh";
        this.food = "Oats";
        this.color = "Violet";
    }

    public Horse(Horse horse) {
        this.legs = horse.legs;
        this.sound = horse.sound;
        this.food = horse.food;
        this.color = horse.color;
    }

    @Override
    public Animal clone() {
        return new Horse(this);
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String getType() {
        return "Horse";
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}