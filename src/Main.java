import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

    Zoo zoo = new Zoo();

    Animal lion1 = new Lion("Simba", 5, 25.5);
    Animal lion2 = new Lion("Sigma boy", 5, 25.5);
    Animal elephant = new Elephant("Dumbo", 10, 2.3);

    zoo.addAnimal(lion1);
    zoo.addAnimal(elephant);

    System.out.println("All animals in zoo:");
    zoo.printAnimals();

    System.out.println("\nAnimal sounds:");
    lion1.makeSound();
    elephant.makeSound();

    System.out.println("\nCompare animals:");
    System.out.println("lion1 equals lion2: " + lion1.equals(lion2));

    System.out.println("\nSearch by name:");
    System.out.println(zoo.findByName("Simba"));

    System.out.println("\nAnimals with age 5:");
    zoo.findByAge(5);

    System.out.println("\nAnimals sorted by age:");
    zoo.sortByAge();
    zoo.printAnimals();

    Zookeeper keeper = new Zookeeper("Anna", 4);
    System.out.println("\nZookeeper info:");
    System.out.println(keeper);

    keeper.feedAnimal(lion1);
    keeper.cleanCage(elephant);
    System.out.println("\nSearch animal by name (from console):");

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter animal name: ");
    String inputName = scanner.nextLine();

    Animal foundAnimal = zoo.findByName(inputName);

    if (foundAnimal != null) {
      System.out.println("Found: " + foundAnimal);
    } else {
      System.out.println("Animal not found");
    }

  }
}

