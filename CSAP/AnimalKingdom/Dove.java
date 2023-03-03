public class Dove extends Bird implements Herbivore { 
    @Override
    public boolean canFly() {
        return true;
    }
    @Override
    public String move() {
        return "I am flying";
    }
    @Override
    public String habitat() {
        return "I live near ponds";
    }
    @Override
    public String eat() {
        return "I am eating spiders and sunflower seeds!";
    }
    @Override
    public String eatPlants() {
        return "Spiders and Sunflower seeds!";
    }
}
