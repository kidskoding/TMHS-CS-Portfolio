public class Axolotl extends Amphibian implements Herbivore {
    @Override
    public String reproduce() {
        return "I am making more axolotls";
    }
    @Override
    public String move() {
        return "I am swiftly moving!";
    }
    @Override
    public String habitat() {
        return "I live on water and land";
    }
    @Override
    public String eat() {
        return "I am probably eating worms or something.";
    }
    @Override
    public String eatPlants() {
        return "Larvae and worms";
    }
}
