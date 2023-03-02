public abstract class Bird extends Endotherm {
    @Override
    public String reproduce() {
        return "I can reproduce!";
    }
    public abstract boolean canFly();
}
