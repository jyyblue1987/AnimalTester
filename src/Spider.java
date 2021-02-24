public class Spider extends Animal {

    // no parameters constructor
    Spider() {
        super();
    }

    // four incoming parameters 
    Spider(int l, int e, String eat, String sound) {
        // invoke the parent constructor (i.e. of the Animal class) appropriately
        super(l, e, eat, sound);
    }

    // override the method with the same name within the class Animal
    public void printAnimal() {
        System.out.println(String.format("From Spider: legs %d, eyes %d, eat %s, says \"nothing\"", getLegs(), getEyes(), getEat(), getSound()));
        // invoke the method printAnimal within the superclass/parent (i.e. Animal class). 
        super.printAnimal();
    }

    // set the value of the instance variable legs by calling its parent’s (i.e. Animal class) own method setLegs
    public void setSpiderLegs(int legs) {
        super.setLegs(legs);
    }
}