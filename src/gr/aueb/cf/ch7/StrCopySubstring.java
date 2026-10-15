package gr.aueb.cf.ch7;

public class StrCopySubstring {
    public static void main(String[] args) {
        String s1 = "Coding";
        String s2 = s1;    //copy. Είναι αξιόπιστο γιατι είναι immutable.

        //Substring
        String s3 = s1.substring(1);  //oding
        String s4 = s1.substring(1,3);          // od. Αν θέλω το C θα βάλω 0.και το 3 δεν το λαμβ. υποψιν


    }
}
