package Arrays.Standard;

public class Find_Missing_number_in_Array_1_to_N {
    static void main(String[] args) {
        int[] nums={1,2,4,5};
        System.out.println("Missing Number is :"+Missing_number(nums));
    }
    static int Missing_number(int[] nums){
        int N=nums.length+1;
         int Total_sum=N*(N+1)/2;
         int sum=0;
         for(int i:nums){
             sum+=i;
         }
         int missing_num=Total_sum-sum;
         return missing_num;
    }
}
