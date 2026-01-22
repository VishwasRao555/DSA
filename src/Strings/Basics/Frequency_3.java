package Strings.Basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency_3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String:");
        String a = sc.nextLine().toLowerCase();
        HashMap<Character,Integer> freq=new HashMap<>();
        for(char ch:a.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        char first_Repeating_ch=0;
        char first_non_Repeating_ch=0;
        for(char ch:a.toLowerCase().toCharArray()){
            if(freq.get(ch)>1){
                first_Repeating_ch=ch;
                break;
            }
        }
        for(char ch:a.toLowerCase().toCharArray()){
            if(freq.get(ch)==1){
                first_non_Repeating_ch=ch;
                break;
            }
        }
        System.out.println("First Repeating Character-->"+first_Repeating_ch);
        System.out.println("First Non-Repeating Character-->"+first_non_Repeating_ch);
    }
}
