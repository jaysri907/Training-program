package Apexon.src.Apexon;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Stack {
    public static void main(String[] args) {
        String s = "(a + (b -c) +z - z)";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> bracket = new HashMap();

        bracket.put('}', '{');
        bracket.put(')', '(');
        bracket.put(']', '[');
        for (Character c : s.toCharArray()) {

            if (bracket.containsKey(c)) {
                //closing now checking for opening
                if (stack.isEmpty())
                    return false;
                while (true) {
                    char curr = stack.pop();
                    char target = bracket.get(c);
                    if (curr == target) {
                        break;
                    }
                    if ("{}()[]".contains(c.toString())) {
                        return false;
                    }
                    if (stack.isEmpty())
                        return false;
                }
            } else {
                stack.push(c);
            }
        }
        if (stack.isEmpty())
            return true;
        else
            return false;
    }
}


