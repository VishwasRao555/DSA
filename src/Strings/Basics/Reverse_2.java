package Strings.Basics;

import java.util.Scanner;

public class Reverse_2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your String:");
        String a=sc.nextLine();
        char[] arr=a.toCharArray();
        int left=0, right =a.length()-1;
                                /*Best Way to Deal with This Situation
                                When We want to Divide the limit by Half
                                (Use While Loop and Left and Right)*/
        while (left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        //We can convert the array of char to String to Print in two Ways
        String rev=new String(arr);  //Best Way
        System.out.println(rev);
        System.out.println(String.valueOf(arr));
    }
}
