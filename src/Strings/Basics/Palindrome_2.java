package Strings.Basics;

import java.util.Scanner;

public class Palindrome_2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String:");
        String a = sc.nextLine();
        if(CheckPalindrome(a)) System.out.println("It is a Palindrome..");
        else System.out.println("It is not a Palindrome");

    }
    static boolean CheckPalindrome(String a){
        int length=0, right=a.length()-1;//BEST way to Check Palindrome
        while(length<right){
            if(a.charAt(length)!=a.charAt(right)){
                  return false;//if not equal it will return false and skip true
            }
            length++;
            right--;
        }
        return true;
    }
}
