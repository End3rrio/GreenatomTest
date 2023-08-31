package org.example;

public class Task3 {
        public static void main(String[] args) {
            String str1 = "level";
            String str2 = "или";
            String str3 = "кокос";
            boolean isPalindrome1 = isPalindrome(str1);
            boolean isPalindrome2 = isPalindrome(str2);
            boolean isPalindrome3 = isPalindrome(str3);
            System.out.println(str1 + " is palindrome: " + isPalindrome1);
            System.out.println(str2 + " is palindrome: " + isPalindrome2);
            System.out.println(str3 + " is palindrome: " + isPalindrome3);
        }

        public static boolean isPalindrome(String str) {
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equals(reversed);
        }

}
