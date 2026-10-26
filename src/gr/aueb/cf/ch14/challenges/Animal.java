package gr.aueb.cf.ch14.challenges;


/**
 * Η κλάση Animal αναπαριστά ένα γενικό ζώο
 * με βασικά χαρακτηριστικά όπως το όνομα και την ηλικία.
 */
public class Animal {

    private String name = "";
    private int age = 0;

    public Animal(){}

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Εκτυπώνει τον γενικό ήχο ενός ζώου.
     */
    public void speak() {
        System.out.println("I'm an animal");
    }

    @Override
    public String toString() {
        return "Animal{" + "name='" + name + '\'' +", age=" + age + '}';
    }
}
