public class Lion extends Mammal implements Carnivore {
    @Override
    public boolean canFly() {
        return false;
    }
    @Override
    public String move() {
        return "Moving slowly across the savannah reins!";
    }
    @Override
    public String habitat() {
        return "Savannah!";
    }
    @Override
    public String eat() {
        return "Eating zebras!";
    }
    @Override
    public String eatMeat() {
        return "Zebras, antelopes, and wildbeest!";
    }
}
