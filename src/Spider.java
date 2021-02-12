public class Spider extends Animal {
    Spider() {
        super();
    }

    Spider(int l, int e, String eat, String sound) {
        super(l, e, eat, sound);
    }

    public void printAnimal() {
        System.out.println(String.format("From Spider: legs %d, eyes %d, eat %s, says \"nothing\"", getLegs(), getEyes(), getEat(), getSound()));
        super.printAnimal();
    }

    public void setSpiderLegs(int legs) {
        super.setLegs(legs);
    }
}