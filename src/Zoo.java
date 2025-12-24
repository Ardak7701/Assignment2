import java.util.ArrayList;
public class Zoo {
    private ArrayList<Animal> animals;
    public Zoo() {
        animals = new ArrayList<>();
    }
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
    public Animal findByName(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        return null;
    }
    public void findByAge(int age) {
        for (Animal animal : animals) {
            if (animal.getAge() == age) {
                System.out.println(animal);
            }
        }
    }
    public void sortByAge() {
        for (int i = 0; i < animals.size(); i++) {
            for (int j = i + 1; j < animals.size(); j++) {
                if (animals.get(i).getAge() > animals.get(j).getAge()) {
                    Animal temp = animals.get(i);
                    animals.set(i, animals.get(j));
                    animals.set(j, temp);
                }
            }
        }
    }
    public void printAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
