package Arrays.Standard;

public class Find_Missing_number_in_Array_1_to_N {
    static void main(String[] args) {
        int[] nums={1,2,4,5};
        System.out.println("Missing Number is :"+Missing_number(nums));
    }
    static int Missing_number(int[] nums){
         int N=nums.length+1;//Total Length of the Array Including the Missing Number
         int Total_sum=N*(N+1)/2;//Sum of N natural Number
         int sum=0;
         for(int i:nums){
             sum+=i;//Sum of the Array excluding the missing Number
         }
         int missing_num=Total_sum-sum;//x=sum-(sum-x)
         return missing_num;
    }
}
