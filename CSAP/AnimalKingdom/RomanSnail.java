public class RomanSnail extends Snail implements Herbivore {
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
        return "Meadows";
    }
    @Override
    public String eat() {
        return "Eating leaves";
    }
    @Override
    public String eatPlants() {
        return "Leaves, Plants, Trees, Stems, Fruits";
    }
}
