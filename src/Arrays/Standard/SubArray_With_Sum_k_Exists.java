package Arrays.Standard;
import java.util.HashSet;

public class SubArray_With_Sum_k_Exists {
    public static void main(String[] args) {
       int [] nums={1,5,-2,0,-3,-8};
       int k=1;
        System.out.println(subarray_with_sum_k(nums,k));
    }
    static boolean subarray_with_sum_k(int[] nums,int k){
        HashSet<Integer>set=new HashSet<>();//we use HashSet because we only need to verify if the subarray is present or not
        int prefixSum = 0;
        for (int i : nums) {
            prefixSum += i;
            if (prefixSum == k) return true;/* if prefixsum=k then we return true , because we only need one subarray that is equal to k
            and if that occurs at the first position we can directly use this condition, we only need to verify if subarray exists or not */
            //OR we can add 0 in the Set and remove the prefixsum==k condition ...
            if (set.contains(prefixSum - k)) {
                return true;// just like count subarray sum equal to k we check if prefix-k is present in set or not....
            }
            set.add(prefixSum);//add current prefix_sum to set to check in the future
        }
        return false;
    }

}
