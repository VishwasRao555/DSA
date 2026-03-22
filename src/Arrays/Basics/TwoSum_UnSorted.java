package Arrays.Basics;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_UnSorted {
    static int[] twoSum_for_UnsortedArrays(int[] array,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<array.length;i++){
            int element2=target-array[i];//if 1+5=6 then 6-1=5
            if(map.containsKey(element2)){//Checks if the element2 is present in the map as a Key
                return new int[] {map.get(element2),i};
            }
            map.put(array[i],i);//Adds the [key,value] pair, key=integer and value=index of the integer
        }
        return new int[] {-1,-1};//No Solution
    }
    public static void main(String[] args) {
        int[] nums1={3,1,9,5,7};
        int target=6;
        int[] result=twoSum_for_UnsortedArrays(nums1,target);
        System.out.println(Arrays.toString(result));
    }
}
