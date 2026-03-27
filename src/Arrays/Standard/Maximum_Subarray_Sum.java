package Arrays.Standard;

public class Maximum_Subarray_Sum {
    static void main(String[] args) {
        int[] nums ={1,-2,4,-2,7,-1,2,5,-4,-1,4,1};
        System.out.println(max_subarray_sum(nums));

    }
    /*Kadane's Algorithm :-
    (prefix_sum the array and if prefix_sum at a position < 0(negative) ;
     then it will reset to 0 to ensure the prefix sum is Maximum */
    static long max_subarray_sum(int[] nums){
        long prefix_sum=0;
        long max_sum=Long.MIN_VALUE;//least value possible to ensure that Long.max(will give max value)
        for(int i:nums){
            prefix_sum+=i;
            max_sum=Math.max(max_sum,prefix_sum);//replaces the max_sum with maximum value among both
            if(prefix_sum<0) prefix_sum=0;//if the prefix_sum at a position is less than 0 (prefix_sum<0), then it will reset to 0
        }
        return max_sum;
    }
}
