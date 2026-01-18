package Strings.Basics;

import java.util.Scanner;

public class Palindrome_1 {  //Comparing Original and Reverse Strings to Check Palindrome...
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your String:");
            String a = sc.nextLine();
            if(Check_Reverse1(a)) {    // Using Loop
                System.out.println("IS A Palindrome..");
            }
            else if(Check_Reverse2(a)){    //  Using StringBuilder Reverse Method
                System.out.println("IS A Palindrome..");
            }
            else
                System.out.println("Not a Palindrome...");
        }

        static boolean Check_Reverse1(String a) {
            String rev = "";
            for (int i = a.length() - 1; i >= 0; i--) {
                rev = rev + a.charAt(i);//Using A String Will Create A New object,
                // every time we ADD a String ...(Bad Approch)
            }
            if (a.equals(rev)) {
                return true;
            }
            return false;
        }
        static boolean Check_Reverse2(String a) {
            StringBuilder sd=new StringBuilder(a);
            String rev=sd.reverse().toString();//Using StringBuilder is Fast...
            if(a.equals(rev)){
                return true;
            }
            return false;
        }
    }



