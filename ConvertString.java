package Apexon;

import java.util.Map;
import java.util.TreeMap;

public class ConvertString
{
    public static void main(String[] args) {
        Map<Character, Integer> map = new TreeMap<>();

        String blah = "aaaabbbbddd";

        for (int i = 0; i < blah.length(); i++) {
            char c = blah.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, (map.get(c) + 1));
            }
        }

        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            System.out.print(entry.getKey() + "" + entry.getValue());
        }
    }
}
