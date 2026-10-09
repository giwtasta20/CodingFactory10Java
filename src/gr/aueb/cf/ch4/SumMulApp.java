package gr.aueb.cf.ch4;

/**
 * Υπολογίζει και εκτυπώνει το άθροισμα
 * και το γινομενο των ακεραιων από 1 εως 10
 */
public class SumMulApp {
    public static void main(String[] args) {
        //Δηλωση και αρχικοποίηση
        int sum = 0;
        int mul = 1;

        //επεξεργασία των δεδομένων
        for (int i = 1; i <=10; i++) {
            sum += i;
            mul *= i;
        }
        System.out.println("To αθροισμα των ακέραιων από 1 ως 10 είναι :" +sum);
        System.out.println("To γινόμενο των ακέραιων από 1 ως 10 είναι :" +mul);

    }
}
