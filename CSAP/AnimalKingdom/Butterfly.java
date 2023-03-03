public class Butterfly extends Insect implements Herbivore {
    @Override
    public int getLegCount() {
        return 0; //they have no legs
    }
    @Override
    public String livesOnLand() {
        return "I live on land!";
    }
    @Override
    public String reproduce() {
        return "So many butterflies!";
    }
    @Override
    public String move() {
        return "Flapping high up in the sky!";
    }
    @Override
    public String habitat() {
        return "Usually near flowering plants!";
    }
    @Override
    public String eat() {
        return "Eating plants!";
    }
    @Override
    public String eatPlants() {
        return "Flowers";
    }
}
