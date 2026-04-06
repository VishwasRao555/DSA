package Arrays.Basics;

import java.util.HashMap;
import java.util.Map;

public class Count_Frequency_Of_Each_Element_In_Array {
    static void main(String[] args) {
        int[] nums = {2, 5, 6, 5, 4, 7, 8, 5, 2, 3, 6, 0, 9, 4, 2, 1, 2, 5, 6,};
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();//Create a HashMap to Store the Element and its Frequency
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            //We Store the Element and the Frequency in the HashMap ,
            // if the current Element is Already present in the HashMap we Use the map.getOrDefault() method to get the value of the Element...
            // if it is already Present and ADD 1 to it or if the Element is new We Simply Add +1 to the Zero.....
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "-->" + entry.getValue());
            //we use  Entry<Integer,Integer>(~data type) to print the Hashmap's Key value pairs
            // using the map.entrySet() which stores both the Key value Pairs in it
            }
    }
}
