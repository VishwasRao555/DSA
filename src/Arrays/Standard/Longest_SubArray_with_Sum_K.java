package Arrays.Standard;

import java.util.HashMap;

public class Longest_SubArray_with_Sum_K {
    public static void main(String[] args) {
        int[] nums = {0,0,0,-1,0,1,0,0,0,0};
        int k = 1;
        System.out.println(longest_SubArray_with_Sum_K(nums,k));
    }
    static int longest_SubArray_with_Sum_K(int[] nums,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int prefixsum=0;
        int length=0;
        map.put(0,-1);//prefixsum will be Zero before the 0 index which is "-1"
        for (int i=0; i <nums.length;i++){
            prefixsum+=nums[i];//Adding the value of current value of nums[i] to prefixsum
            if(map.containsKey(prefixsum-k)){
                //Updating the length to the biggest length of previous and current length
                length=Math.max(length,i-map.get(prefixsum-k));//the second int wil give us the length of subarray in between the i and end of prefixsum-k (which is the SubArray)
            }
            //we should not change or update the value of indexs , because we do it will increase the index value ( and we cant see the longest subarray of sum k)
            if(!map.containsKey(prefixsum)){//we should not add current_prefix if it is already present in hashmap
                map.put(prefixsum,i);//we should add  the current prefix so we can verify if[ (Current_prefixsum-k)*in future] is present in the map (Verifies By removing the previous prefixsum we get K or not
            }
        }
      return length;
    }
}
