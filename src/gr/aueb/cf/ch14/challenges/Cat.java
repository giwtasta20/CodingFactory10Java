package gr.aueb.cf.ch14.challenges;

/**
 * Η κλάση Cat κληρονομεί από την Animal
 * και αναπαριστά μία γάτα.
 */
public class Cat extends Animal {

    public Cat() {}

    public Cat(String name, int age) {
        super(name, age);
    }


    /**
     * Κάνει override τη μέθοδο speak και εκτυπώνει τον ήχο της γάτας.
     */
    @Override
    public void speak() {
        System.out.println("I'm a cat");
    }


    @Override
    public String toString() {
        return "Cat{" + "name='" + getName() + '\'' +", age=" + getAge() + '}';
    }
}
