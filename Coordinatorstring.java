package Apexon;

import java.util.Arrays;

public class Coordinatorstring {
    private static int[] findDistance(String position, int[] index) {
        int x = index[0];
        int y = index[1];
        if (position.contains(" ")) position = fixPosition(position);
        position = position.toUpperCase();
        for (int i = 0; i < position.length(); i++) {
            if (position.charAt(i) == 'L') {
                x--;
            } else if (position.charAt(i) == 'R') {
                x++;
            } else if (position.charAt(i) == 'U') {
                y++;
            } else if (position.charAt(i) == 'D') {
                y--;
            }
        }
        return new int[]{x, y};
    }

    private static String fixPosition(String position) {
        String[] s = position.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            int count = 0;
            if (s[i].contains("x")) {
                String cnt = s[i].substring(0, s[i].indexOf("x"));
                count = Integer.parseInt(cnt);
            }
            StringBuilder dir = new StringBuilder("");
            if (s[i].toUpperCase().contains("UP")) {
                dir.append("U");
            } else if (s[i].toUpperCase().contains("DOWN")) {
                dir.append("D");
            } else if (s[i].toUpperCase().contains("LEFT")) {
                dir.append("L");
            } else if (s[i].toUpperCase().contains("RIGHT")) {
                dir.append("R");
            }
            if (count == 0) sb.append(dir);
            while (count > 0) {
                sb.append(dir);
                count--;
            }
        }
        return sb.toString();
    }


    public static void main(String[] args)
    {

        String position="UUU";
        int[] arr={0,0};
        System.out.println(Arrays.toString(findDistance(position, arr)));

    }
}