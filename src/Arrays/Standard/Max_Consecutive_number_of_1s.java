package Arrays.Standard;

public class Max_Consecutive_number_of_1s {
    static void main(String[] args) {
        int[] nums={0,1,1,1,0,1,1,0,0,0,1,1,1,1,0};
        System.out.println(Max_consecutive_1s(nums));
    }
    static int Max_consecutive_1s(int[] nums){
        int count=0;//counts the number of consecutive 1's
        int max=0;//maximum count of 1' among all
        for (int i=0;i<nums.length;i++){
            if(nums[i]==1) {
                count++;//if element is 1 increase the count by 1
                max=Integer.max(max,count);//Gives the max number between current count and privious counts
            }
            else count=0;//count resets to "0" if the element is not 1
        }
        return max;
    }
}
