public class Snake extends Reptile implements Carnivore {
    @Override
    public String reproduce() {
        return "I am giving birth proliferating the number of snakes!";
    }
    @Override
    public String move() {
        return "Slittttheeeerrrr";
    }
    @Override
    public String habitat() {
        return "You can usually find me near sewers and usually at night!";
    }
    @Override
    public String eat() {
        return "I usually eat dead rodents :(";
    }
    @Override
    public String eatMeat() {
        return "Rodents, Insects, Birds, and Frogs";   
    }
}
