public class Lion extends Animal {
    Lion() {
        super();
    }

    Lion(int l, int e, String eat, String sound) {
        super(l, e, eat, sound);
    }

    public void printAnimal() {
        System.out.println(String.format("From Lion: legs %d, eyes %d, eat %s, says \"nothing\"", getLegs(), getEyes(), getEat(), getSound()));

        super.printAnimal();
    }

    public void setLionLegs(int legs) {
        super.setLegs(legs);
    }

}