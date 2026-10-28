package gr.aueb.cf.ch17.maps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        //add & update
        map.put("GR", "Greece");
        map.put("US", "United States");
        map.put("GR", "Hellas");  // update
        map.put("IT", "Italy");

        //get
        String country = map.get("GR");
        System.out.println(country);

        //remove
        map.remove("US");

        //traverse
        map.forEach((k, v) -> System.out.println(k + " => " + v));

    }
}
