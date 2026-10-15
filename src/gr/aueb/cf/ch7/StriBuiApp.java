package gr.aueb.cf.ch7;

public class StriBuiApp {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String result;
        String reversed;


        sb.append("hello");
        sb.append(" ");
        sb.append("World");

        result = sb.toString(); //typecast σε string
        reversed = sb
                .reverse()
                .toString();

    }
}
