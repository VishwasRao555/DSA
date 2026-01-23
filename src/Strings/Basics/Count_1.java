package Strings.Basics;

import java.util.Scanner;

public class Count_1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String:");
        String a = sc.nextLine();
        int len=a.length();
        int count_v=0,count_c=0,count_n=0,count_s=0,count_special=0;
        for(int i=0;i<len;i++){
            char ch=a.charAt(i);
            if(ch>='0'&& ch<='9') count_n++;
            else if (ch==' ') count_s++;
            else if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')){
                ch=Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') count_v++;
                else count_c++;
            }
            else count_special++;
        }
        System.out.println("Numbers-->"+count_n);
        System.out.println("Spaces-->"+count_s);
        System.out.println("Vowels-->"+count_v);
        System.out.println("Consonants-->"+count_c);
        System.out.println("Special Characters-->"+count_special);
    }
}
