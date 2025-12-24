public class Elephant extends Animal {
    private double trunkLength; // in meters
    public Elephant(String name, int age, double trunkLength) {
        super(name, age);
        this.trunkLength = trunkLength;
    }
    public double getTrunkLength() {
        return trunkLength;
    }
    public void sprayWater() {
        System.out.println(getName() + " sprays water with trunk");
    }
    @Override
    public void makeSound() {
        System.out.println("Elephant trumpets loudly");
    }
    @Override
    public String toString() {
        return "Elephant - " + super.toString() +
                ", trunk length: " + trunkLength + " m";
    }
}

