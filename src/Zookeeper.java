public class Zookeeper {
    private String name;
    private int experience; // years of experience
    public Zookeeper(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }
    public String getName() {
        return name;
    }
    public int getExperience() {
        return experience;
    }
    public void feedAnimal(Animal animal) {
        System.out.println(name + " feeds " + animal.getName());
    }
    public void cleanCage(Animal animal) {
        System.out.println(name + " cleans cage of " + animal.getName());
    }
    @Override
    public String toString() {
        return "Zookeeper name: " + name + ", experience: " + experience + " years";
    }
}
