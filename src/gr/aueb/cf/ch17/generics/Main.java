package gr.aueb.cf.ch17.generics;

public class Main {

    public static void main(String[] args) {
        FlexibleNode flexibleNode = new FlexibleNode("Coding");
        int value = (int) flexibleNode.getValue();

        System.out.println(value);
    }
}