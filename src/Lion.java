public class Lion extends Animal {
    // no parameters constructor
    Lion() {
        super();
    }

    // four incoming parameters 
    Lion(int l, int e, String eat, String sound) {
        // invoke the parent constructor (i.e. of the Animal class) appropriately
        super(l, e, eat, sound);
    }

    // print information about the current state (i.e. value) of each instance variable.
    public void printAnimal() {
        System.out.println(String.format("From Lion: legs %d, eyes %d, eat %s, says \"nothing\"", getLegs(), getEyes(), getEat(), getSound()));

        // invoke the method printAnimal within the superclass/parent (i.e. Animal class). 
        super.printAnimal();
    }

    // set the value of the instance variable legs by calling its parent’s (i.e. Animal class) own method setLegs
    public void setLionLegs(int legs) {
        super.setLegs(legs);
    }

}