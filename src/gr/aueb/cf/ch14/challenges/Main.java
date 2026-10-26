package gr.aueb.cf.ch14.challenges;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal animal1 = new Dog("nala", 3);
        Animal animal2 = new Cat("grey", 7);

        doSpeak(animal);
        doSpeak(animal1);
        doSpeak(animal2);


        printState(animal);
        printState(animal1);
        printState(animal2);
    }

    public static void doSpeak(Animal animal) {
        animal.speak();
    }

    public static void printState(Animal animal) {
        System.out.println(animal.toString());
    }
}
