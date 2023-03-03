public class BananaSlug extends Slug implements Herbivore {
    @Override
    public String livesOnLand() { return "I live on Land!"; }
    @Override
    public String reproduce() {
        return "MORE BANANA SLUGS!";
    }
    @Override
    public String habitat() {
        return "Near damp and forest areas";
    }
    @Override
    public String eat() {
        return "Eating flowers";
    }
    @Override
    public String eatPlants() {
        return "Flowers, Leaves, Stems";
    }
}
