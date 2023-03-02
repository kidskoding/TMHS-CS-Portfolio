public class Dove extends Bird { 
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
}
