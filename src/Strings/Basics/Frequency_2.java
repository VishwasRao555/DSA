package Strings.Basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency_2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String:");
        String a = sc.nextLine().toLowerCase();
        HashMap<Character,Integer> freq=new HashMap<>();
        for(char ch:a.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        //MAX and MIN
        char max_ch=0,min_ch=0;
        int maxx=Integer.MIN_VALUE;
        int minn=Integer.MAX_VALUE;
        for(Map.Entry<Character,Integer> m:freq.entrySet()){
            if(m.getValue()>maxx){
                maxx=m.getValue();
                max_ch=m.getKey();
            }
            if(m.getValue()<minn){
                minn=m.getValue();
                min_ch=m.getKey();
            }
        }
        System.out.println("min repeats of a character-->"+min_ch);
        System.out.println("Max repeats of a character-->"+max_ch);
    }
}
