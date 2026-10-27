package gr.aueb.cf.ch16.challenges;


public class Document implements IPrintable, Runnable {

    @Override
    public void run() {
        print();
    }

    @Override
    public void print() {
        System.out.println("Printing document...");
    }
}
