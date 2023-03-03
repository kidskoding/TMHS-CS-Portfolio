public class GoldFish extends Fish implements Herbivore {
    @Override
    public String swim() {
        return "I am swimming!";
    }
    @Override
    public String reproduce() {
        return "I am giving birth to more fish!";
    }
    @Override
    public String move() {
        return "I am usually swimming under water!";
    }
    @Override
    public String habitat() {
        return "Come find me near big bodies of water!";
    }
    @Override
    public String eat() {
        return "I am usually eating crustaceans and squid";
    }
    @Override
    public String eatPlants() {
        return "Crustaceans and Squid!";
    }
}
