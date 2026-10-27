package gr.aueb.cf.ch16.callbacks;

public class Main {
    public static void main(String[] args) {

        //Anonymous class
        IPrintable printable = new IPrintable() {
            @Override
            public void print() {
                System.out.println("Hello from the anonymous class!");
            }
        };
        //Lambda expression   (Υλοποίηση της print)
        IPrintable iPrintable2 = () -> System.out.println("Hello from the lambda expression!");

        doPrint(new IPrintable() {
            @Override
            public void print() {
                System.out.println("Hello from the anonymous class in doPrint!");
            }
        });

        doPrint(() -> System.out.println("Hello from the lambda expression in doPrint!"));

        doPrint(() -> sayHello());  //Lambda expression that calls the sayHello method
        doPrint(Main::sayHello);   //method reference
    }



    public static void doPrint (IPrintable printable) {

        printable.print();
    }

    public static void sayHello() {

        System.out.println("Hello from the sayHello method!");
    }
}
