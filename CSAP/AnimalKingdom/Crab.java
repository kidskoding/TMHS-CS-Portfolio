public class Crab extends Crustacean implements Herbivore, Carnivore {
    @Override
    public String livesOnLand() {
        return "I live on land!";
    }
    @Override
    public String reproduce() {
        return "More crabs!";
    }
    @Override
    public String move() {
        return "Slowly trudding with my pincers!";
    }
    @Override
    public String habitat() {
        return "Near the sand and beaches!";
    }
    @Override
    public String eat() {
        return "Eating algae";
    }
    @Override
    public String eatPlants() {
        return "Algae, Seaweed";
    }
    @Override
    public String eatMeat() {
        return "Mollusks, Fish";
    }
}
