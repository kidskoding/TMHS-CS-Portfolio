public class Raven extends Bird implements Carnivore, Herbivore {
    @Override
    public boolean canFly() {
        return true;
    }
    @Override
    public String move() {
        return "I am flying";
    }
    @Override
    public String habitat() {
        return "I live near trees";
    }
    @Override
    public String eat() {
        return "I am eating eggs and berries!";
    }
    @Override
    public String eatPlants() {
        return "Berries, Fruits, and Leaves";
    }
    @Override
    public String eatMeat() {
        return "Eggs";
    }
}
