public class Lizard extends Reptile implements Herbivore {
    @Override
    public String reproduce() {
        return "More child lizards!";
    }
    @Override
    public String move() {
        return "Currently moving !";
    }
    @Override
    public String habitat() {
        return "I live in deserts, forests, prairies, marshes, and rocky areas!";
    }
    @Override
    public String eat() {
        return "I am eating small invertebrates!";
    }
    @Override
    public String eatPlants() {
        return "Insects and Spiders";
    }
}
