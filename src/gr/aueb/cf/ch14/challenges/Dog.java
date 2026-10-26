package gr.aueb.cf.ch14.challenges;

/**
 * Η κλάση Dog κληρονομεί από την Animal
 * και αναπαριστά έναν σκύλο.
 */
public class Dog extends Animal{

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    /**
     * Κάνει override τη μέθοδο speak και εκτυπώνει τον ήχο του σκύλου.
     */
    @Override
    public void speak() {
        System.out.println("I'm a dog");
    }

    @Override
    public String toString() {
        return "Dog{" + "name='" + getName() + '\'' +", age=" + getAge() + '}';
    }
}
