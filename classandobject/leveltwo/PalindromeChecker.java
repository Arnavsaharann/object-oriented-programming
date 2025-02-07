package com.bridgelabz.classandobject.leveltwo;

public class PalindromeChecker {
    private String text;

    public PalindromeChecker(String text){
        this.text = text;
    }

    // function to check if palindrome
    public boolean isPalindrome(){
        int low = 0;
        int high = text.length() - 1;

        while(low <= high){
            if(text.charAt(low) != text.charAt(high)){
                return false;
            }
            low ++;
            high --;
        }
        return true;
    }

    // function to display results
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("is a palindrome.");
        } else {
            System.out.println("is not a palindrome.");
        }
    }

    public static void main(String[] args){
        PalindromeChecker checker1 = new PalindromeChecker("racecar");
        checker1.displayResult();

        PalindromeChecker checker2 = new PalindromeChecker("Hello");
        checker2.displayResult();
    }
}
