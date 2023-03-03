public class Frog extends Amphibian implements Carnivore {
    @Override
    public String reproduce() {
        return "I am making more frogs";
    }
    @Override
    public String move() {
        return "I am hopping";
    }
    @Override
    public String habitat() {
        return "I live on water or land";
    }
    @Override
    public String eat() {
        return "I am probably eating crickets or something.";
    }
    @Override
    public String eatMeat() {
        return "Flies and Crickets";
    }
}
