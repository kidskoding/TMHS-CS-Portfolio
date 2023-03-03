public class Scorpion extends Arachnid implements Carnivore {
    @Override
    public String livesOnLand() {
        return "I live on land!";
    }
    @Override
    public String reproduce() {
        return "More SCORPIONS!!!";
    }
    @Override
    public String move() {
        return "Moving on land slowly and silently waiting for my next victim!";
    }
    @Override
    public String habitat() {
        return "Living near the land...";
    }
    @Override
    public String eat() {
        return "Most likely eating spiders";
    }
    @Override
    public String eatMeat() {
        return "Lizards and Rodents. Spiders as well";
    }
}
