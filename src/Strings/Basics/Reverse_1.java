package Strings.Basics;
import java.util.Scanner;
public class Reverse_1 {
        static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter your String:");
            String a=sc.nextLine();
            int alen=a.length();
            String b="";//Create a New String and add the characters one by one in Reverse
            for(int i=alen-1;i>=0;i--) {
                b=b+a.charAt(i);
            }
            System.out.println(b);
        }
    }

