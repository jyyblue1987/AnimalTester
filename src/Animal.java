public class Animal {
    protected int legs = 0;
    protected int eyes = 0;
    protected String eat = "";
    protected String sound = "";

    Animal() {
        setLegs(0);
        setEyes(0);
        setEat("nothing");
        setSound("nothing");
    }

    Animal(int l, int e, String eat, String sound) {
        setLegs(l);
        setEyes(e);
        setEat(eat);
        setSound(sound);
    }

    final public int getLegs() {
        return legs;
    }

    final public void setLegs(int v) {
        legs = v;
    }

    final public int getEyes() {
        return eyes;
    }

    final public void setEyes(int v) {
        eyes = v;
    }

    final public String getEat() {
        return eat;
    }

    final public void setEat(String v) {
        eat = v;
    }

    final public String getSound() {
        return sound;
    }

    final public void setSound(String v) {
        sound = v;
    }

    public void printAnimal() {
        System.out.println(String.format("From Animal: This animal has %d legs, %d eyes, eats %s, sounds \"%s\"", getLegs(), getEyes(), getEat(), getSound()));
    }

}
