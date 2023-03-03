public class Ant extends Insect implements Herbivore, Carnivore {
    @Override
    public int getLegCount() {
        return 6;
    }
    @Override
    public String livesOnLand() {
        return "I live on land!";
    }
    @Override
    public String reproduce() {
        return "A colony of ants!";
    }
    @Override
    public String move() {
        return "Slowly moving!";
    }
    @Override
    public String habitat() {
        return "Usually near sand dunes!";
    }
    @Override
    public String eat() {
        return "Eating larvae!";
    }
    @Override
    public String eatPlants() {
        return "Seeds and Proteins"; 
    }
    @Override
    public String eatMeat() {
        return "Caterpillars and Larvae";
    }
}
