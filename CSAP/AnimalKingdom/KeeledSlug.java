public class KeeledSlug extends Slug implements Herbivore {
    @Override
    public String livesOnLand() { return "I live on Land!"; }
    @Override
    public String reproduce() {
        return "MORE KEELED SLUGS!";
    }
    @Override
    public String habitat() {
        return "Near rainforests";
    }
    @Override
    public String eat() {
        return "Eating fruits";
    }
    @Override
    public String eatPlants() {
        return "Plants, Leaves, Flowers, Fruit";
    }
}
