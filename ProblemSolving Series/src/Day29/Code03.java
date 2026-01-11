package Day29;

/*
3️⃣ Check if a String Is Isomorphic
Problem Statement

Two strings are isomorphic if characters in one string can be replaced to get the other string, maintaining order.

Example
Input: egg, add
Output: Yes

Input: foo, bar
Output: No
 */

public class Code03 {
    static void main(String[] args) {
        String s1 = "egg";
        String s2 = "add";

        if (isIsomorphic(s1, s2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static boolean isIsomorphic(String s1, String s2) {

        if (s1.length() != s2.length()) return false;

        char[] map1 = new char[256]; // s1 -> s2
        char[] map2 = new char[256]; // s2 -> s1

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            // if mapping exists, check consistency
            if (map1[c1] != 0 && map1[c1] != c2) return false;
            if (map2[c2] != 0 && map2[c2] != c1) return false;

            // create mapping
            map1[c1] = c2;
            map2[c2] = c1;
        }

        return true;
    }
}
