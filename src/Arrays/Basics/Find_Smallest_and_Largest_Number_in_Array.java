package Arrays.Basics;

public class Find_Smallest_and_Largest_Number_in_Array {
    static void main(String[] args) {
        int[] nums={8,4,0,-6,7,2,9,-5};
        int n=nums.length;
        System.out.println("Minimum Number in Array:"+smallest_number(nums,n));
        System.out.println("Minimum Number in Array:"+largest_number(nums,n));
    }
    static int smallest_number(int[] nums,int n){
        if(n<1) return -1;//if length is less than one , then array is empty
        int min=Integer.MAX_VALUE;// We are initializing the min with Largest value Possible to compare with the min values
        for(int i=0;i<n;i++){
            min=Math.min(min,nums[i]);//we are the comparing the min value up too now and the next possible min value
        }
        return min;
    }
    static int largest_number(int[] nums,int n) {
        if(n<2) return -1;//if length is less than one , then array is empty
        int max = Integer.MIN_VALUE;// We are initializing the max with Smallest value Possible to compare with the max values
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);//we are comparing the max value upto now with the next possible max value
        }
        return max;
    }
}
