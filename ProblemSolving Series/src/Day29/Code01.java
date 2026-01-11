//package Day29;
//
///*
//1️⃣ Find the Second Most Frequent Character
//Problem Statement
//Given a string, find the second most frequent character.
//Example
//Input: aabbccc
//Output: b
//
// */
//
//import java.util.ArrayList;
//
//public class Code01 {
//    static void main(String[] args) {
//
//        String str = "aabbccc";
//
//        ArrayList<Character> visited = new ArrayList<>();
//
//        char first = '\0', second = '\0';
//        int max = 0, secondMax = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//
//            if (visited.contains(ch)) continue;
//            visited.add(ch);
//
//            int count = 0;
//            for (int j = 0; j < str.length(); j++) {
//                if (str.charAt(j) == ch) {
//                    count++;
//                }
//            }
//            if (count > max) {
//                secondMax = max;
//                second = first;
//                max = count;
//                first = ch;
//            }
//            else if (count > secondMax && count < max) {
//                secondMax = count;
//                second = ch;
//            }
//        }
//
//        if (second == '\0') {
//            System.out.println("No second most frequent character");
//        } else {
//            System.out.println("Second most frequent character: " + second);
//        }
//
//    }
//}
