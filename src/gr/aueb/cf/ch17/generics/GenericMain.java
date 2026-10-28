package gr.aueb.cf.ch17.generics;


public class GenericMain {
    public static void main(String[] args) {
        GenericNode<String> strNode = new GenericNode<>();
        GenericNode<Double> doubleNode = new GenericNode<>();
        // GenericNode<Integer> intNode = new GenericNode<>();  //diamond operator
        var intNode = new GenericNode<Integer>();  //syntactic sugar

        strNode.setValue("Coding");
        doubleNode.setValue(3.14);
        intNode.setValue(42);

        String str = strNode.getValue();
        double d = doubleNode.getValue();
        int i = intNode.getValue();

        System.out.println(str);
        System.out.println(d);
        System.out.println(i);
    }
}
