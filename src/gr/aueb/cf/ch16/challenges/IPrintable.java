package gr.aueb.cf.ch16.challenges;

public interface IPrintable {

    default void print() {
        System.out.println("Default printing...");
    }
}
