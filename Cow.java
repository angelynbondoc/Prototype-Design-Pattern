public class Cow implements Animal{
    private int legs;
    private String sound;
    private String food;

    public Cow() {
        this.legs = 4;
        this.sound = "Uhmmm";
        this.food = "Grass";
    }

    public Cow(Cow cow) {
        this.legs = cow.legs;
        this.sound = cow.sound;
        this.food = cow.food;
    }

    @Override
    public Animal clone() {
        return new Cow(this);
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String getType() {
        return "Cow";
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

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setFood(String food) {
        this.food = food;
    }
}