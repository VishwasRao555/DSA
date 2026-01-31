package Strings.Basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    static void main(String[] args) {
        HashMap<Integer, String> hm=new HashMap<>();
        hm.put(1,"Vishwas");
        hm.put(2,"Neeraj");
        hm.put(3,"Krishna");
        hm.put(4,"Vinayak");
        hm.replace(4,"Rahul");
        hm.replace(4,"Rahul","Soda");
        System.out.println(hm.containsKey(2));
        System.out.println(hm.containsValue("Rahul"));
        hm.remove(3);
        System.out.println(hm.get(1));
        System.out.println(hm.toString());
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm);
        Set<Map.Entry<Integer,String>> map=hm.entrySet();
        System.out.println(map);
        for(Map.Entry<Integer,String> e: hm.entrySet()){
            System.out.println("Key-->"+e.getKey()+"  Value-->"+e.getValue());
        }
        Integer Target=2;
        for(Map.Entry<Integer,String> set:map){
            if(Target==set.getKey()){
                System.out.println("Value --> "+set.getValue());
            }//OLD Style
        }
        System.out.println(hm.get(Target));
        for(Map.Entry<Integer,String> hello:map){
            hello.setValue(hello.getValue().toUpperCase());
            System.out.println(hello.toString());
            System.out.println("hhi");
            System.out.println("Aaki");
        }
        }


    }

