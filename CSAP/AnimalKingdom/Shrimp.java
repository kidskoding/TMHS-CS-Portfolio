public class Shrimp extends Crustacean implements Herbivore, Carnivore {
    @Override
    public String livesOnLand() {
        return "I live in water!";
    }
    @Override
    public String reproduce() {
        return "More shrimp!";
    }
    @Override
    public String move() {
        return "Slowly swimming in the ocean!";
    }
    @Override
    public String habitat() {
        return "In the ocean!";
    }
    @Override
    public String eat() {
        return "Eating small invertebrates";
    }
    @Override
    public String eatPlants() {
        return "Dead Plants, Algae, Plankton";
    }
    @Override
    public String eatMeat() {
        return "Dead Animals and decaying organic matter";    }
}
