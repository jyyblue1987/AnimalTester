public class AnimalTester {
    public static void main(String[] args) {
        Spider spidy1 = new Spider();
        Spider spidy2 = new Spider(8, 8, "insects", "very quiet");

        Lion lion = new Lion(2, 1, "meat", "roar");

        System.out.println("Going to print out info about spidy1");
        spidy1.printAnimal();

        System.out.println("");
        System.out.println("Going to print out info about spidy2");
        spidy2.printAnimal();

        System.out.println("");
        System.out.println(String.format("spidy1 has %d eyes!", spidy1.getEyes()));
        System.out.println(String.format("But spidy2 has %d eyes!", spidy2.getEyes()));

        spidy1.setSpiderLegs(7);
        System.out.println("");
        System.out.println("Going to print out info about spidy1");
        spidy1.printAnimal();

        System.out.println("");
        System.out.println("Going to print out info about lion");
        lion.printAnimal();

        lion.setLionLegs(4);
        System.out.println("");
        System.out.println("Going to print out info about lion");
        lion.printAnimal();

        lion.setEyes(2);
        System.out.println("");
        System.out.println("Going to print out info about lion");
        lion.printAnimal();

        System.out.println("");
        System.out.println("This program was written by Dr. Castaneda");
        System.out.println("End of program.");

    }
}
