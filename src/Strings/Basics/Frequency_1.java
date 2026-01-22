package Strings.Basics;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Frequency_1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String:");
        String a = sc.nextLine().toLowerCase();
        HashMap<Character,Integer> freq=new HashMap<>();
        for(char ch:a.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        System.out.println("Frequency map:"+freq);
    }
}
