package Apexon;

public class Longestword
{

        public static void main(String[] args) {
            String strs[] = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
            System.out.println(longestCommonSubstring(strs));
        }

        public static String longestCommonSubstring(String[] strs) {
            if (strs == null || strs.length == 0) {
                return "";
            }

            String first = strs[0];
            int n = first.length();
            String longest = "";

            for (int len = 1; len <= n; len++) {
                for (int start = 0; start <= n - len; start++) {
                    String substring = first.substring(start, start + len);
                    boolean found = true;

                    for (int i = 1; i < strs.length; i++) {
                        if (!strs[i].contains(substring)) {
                            found = false;
                            break;
                        }
                    }

                    if (found && substring.length() > longest.length()) {
                        longest = substring;
                    }
                }
            }

            return longest;
        }
    }

