public class Kangaroo extends Mammal {
    @Override
    public boolean canFly() {
        return false;
    }
    @Override
    public String move() {
        return "I am bouncing up and down!";
    }
    @Override
    public String habitat() {
        return "I live near savanna deserts";
    }
    @Override
    public String eat() {
        return "I am eating grasses, shrubs, fruits, and flowering plants!";
    }
}
