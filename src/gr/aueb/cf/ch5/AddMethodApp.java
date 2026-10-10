package gr.aueb.cf.ch5;

public class AddMethodApp {
    public static void main(String[] args) {
        int a = 10;     //δεν χρειάζεται οι πραγματικές μεταβλητες να εχουν το ιδιο ονομα με τις τυπικες
        int b = 20;    // οταν η main καλεί την add αντιγράφει τις τιμές των τυπικων μεταβλητων
        int sum = 0;   //η add αφου εκτελεστει επιστρεφει στην main το sum

        sum = add(a ,b);
        System.out.println("το άθροισμα είναι:" + sum);
    }
// μεσα στην add δηλώνω τις τυπικες παραμέτρους a , b
    public static int add(int a, int b) {
//        //δήλωση και αρχικοποίηση
//        int sum = 0;
//
//        //επεξεργασία
//        sum = a + b;
//
//        //επιστροφή αποτέλεσματος
//        return sum;

        return a + b;
    }
}

