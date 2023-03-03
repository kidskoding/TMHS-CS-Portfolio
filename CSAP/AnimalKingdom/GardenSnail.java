public class GardenSnail extends Snail implements Herbivore {
    @Override
    public String livesOnLand() {
        return "I live on land!";
    }
    @Override
    public String reproduce() {
        return "I reproduce more roman snails!";
    }
    @Override
    public String habitat() {
        return "I live near gardens";
    }
    @Override
    public String eat() {
        return "Eating fruits and leaves";
    }
    @Override
    public String eatPlants() {
        return "Fruits, Leaves, Stems";
    }
}
