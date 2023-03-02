public abstract class Fish extends Ectotherm {
    @Override
    public String livesOnLand() {
        return "I live on water!";
    }
    public abstract String swim();
}
