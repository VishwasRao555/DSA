package Arrays.Standard;
import java.util.*;

public class Count_SubArrays_with_Sum_K {
    public static void main(String[] args) {
        int[] nums = {0, 1, 7, 3, 1, -3, 4, 6};
        int k = 10;
        int count=count_of_subArrays_sum_equal_to_k(nums,k);
        System.out.println(count);
    }//PrefixSum+Hashmap(pattern)
    static int count_of_subArrays_sum_equal_to_k(int[] nums,int k){
        int prefixsum=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);//if K==prefixsum then (prefixsum-K) need to be in Map
        for(int i:nums){
            prefixsum+=i;//PrefixSum
            if(map.containsKey(prefixsum-k)){
                count+=map.get(prefixsum-k);//Increases the Count and if a prefixsum is occurred 2 times it will add to , because there are two possible subarrays.
            }
            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
        }//Adds All the prefixsums to the map, so we can verify if (Current_prefixsum-k) is present in the map(Verifies By removing the previous prefixsum we get K or not
        return count;
    }
}

