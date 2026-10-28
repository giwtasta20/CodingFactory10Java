package gr.aueb.cf.ch17.generics;

public class GenericMethods {
    public static void main(String[] args) {
        String[] strArr = {"Hello", "World"};
        printArray(strArr);

        Integer[] intArr = {1, 2, 3, 4, 5};
        printArray(intArr);

    }


    public static <T> void printArray(T[] arr) {
        for (T element : arr) {
            System.out.println(element);
        }
    }

    public static void print(GenericNode<?> node){ //το ? είναι wildcard, μπορεί να πάρει οποιοδήποτε τύπο
        System.out.println(node.getValue());      // ειναι η super όλων των generic και χρησιμοποιείται όταν δεν υπάρχουν εξαρτησεις στη μεθοδο

    }

    public static void printNumbers(GenericNode<? extends Number> node){   //το ? extends Number σημαίνει ότι μπορεί να πάρει οποιοδήποτε τύπο που είναι υποκλάση του Number (Integer, Double, Float κλπ)
        System.out.println(node.getValue());
    }
    public static void printNumbers2(GenericNode<? super Number> node){   //το ? super Number σημαίνει ότι μπορεί να πάρει οποιοδήποτε τύπο που είναι υπερκλάση του Number(Object)
        System.out.println(node.getValue());
    }
}
