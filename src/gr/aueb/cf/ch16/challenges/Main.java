package gr.aueb.cf.ch16.challenges;

public class Main {

    public static void main(String[] args) {

        Document document = new Document();
        Photo photo = new Photo();

        Thread t1 = new Thread(document);
        t1.start();

        Thread t2 = new Thread(photo);
        t2.start();

    }

}
