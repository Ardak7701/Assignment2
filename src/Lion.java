public class Lion extends Animal {
    private double maneLength; // length of mane in cm
    public Lion(String name, int age, double maneLength) {
        super(name, age);
        this.maneLength = maneLength;
    }
    public double getManeLength() {
        return maneLength;
    }
    public void setManeLength(double maneLength) {
        this.maneLength = maneLength;
    }
    @Override
    public void makeSound() {
        System.out.println("Lion roars loudly");
    }
    public void hunt() {
        System.out.println(getName() + " is hunting");
    }
    @Override
    public String toString() {
        return "Lion - " + super.toString() +
                ", mane length: " + maneLength + " cm";
    }
}
