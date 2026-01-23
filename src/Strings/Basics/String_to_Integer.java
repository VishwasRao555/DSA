package Strings.Basics;

import java.util.Scanner;
//This will only work for small numbers and non-negative and only string with numbers
public class String_to_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String:");
        String a = sc.nextLine();
        System.out.println(parse(a));
        System.out.println(value(a));
        System.out.println(ASCII(a));

    }
    static int parse(String s){
        int  num=Integer.parseInt(s);
        return num;//we can use this method.....
    }
    static int value(String s){
        int num=Integer.valueOf(s);
        return num;//And we can also use this method....
    }
    static int ASCII(String s){
        int num=0;
        for(int i=0;i<s.length();i++) {
            num = num * 10 + (s.charAt(i) - '0');
        }
            /*Because in ASCII digits(0-9)==48-57
            0 == 48 , so we substract i - 48 , if i=1 the 49-48 =1
             */
            return num;
        }
    }

