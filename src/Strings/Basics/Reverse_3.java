package Strings.Basics;

import java.util.Scanner;
public class Reverse_3 {//This StringBUilder and StringBuffer are Best to Reverse a string
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your String:");
        String a=sc.nextLine();
        StringBuilder sb1=new StringBuilder(a);//This is not Thread Safe
        sb1.reverse();
        System.out.println("Stringbuilder:"+sb1.toString());
        StringBuffer sb2=new StringBuffer(a);//This is Tread Safe
        sb2.reverse();
        System.out.println("StringBuffer:"+sb2.toString());
    }
}
