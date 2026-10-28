package gr.aueb.cf.ch17.generics;

/**
 * ορίζει μια κλαση {@link Node}
 * με ενα μονο πεδιο int
 */

public class Node {
    private int value;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
