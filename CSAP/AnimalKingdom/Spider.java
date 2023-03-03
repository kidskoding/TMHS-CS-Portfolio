public class Spider extends Arachnid implements Carnivore {
    @Override
    public String livesOnLand() {
        return "I live on land!";
    }
    @Override
    public String reproduce() {
        return "More Spiders and even MORE arachnids!";
    }
    @Override
    public String move() {
        return "Moving on land with my 8 legs";
    }
    @Override
    public String habitat() {
        return "Living near trees i guess..";
    }
    @Override
    public String eat() {
        return "Most likely eating mosquitoes";
    }
    @Override
    public String eatMeat() {
        return "Mites and Mosquitoes";
    }
}
