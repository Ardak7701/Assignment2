public abstract class Animal {
    private String name;
    private int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public abstract void makeSound();
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Animal animal = (Animal) obj;
        return age == animal.age && name.equals(animal.name);
    }
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}
