package Arrays.Standard;

public class Second_Smallest_and_Largest_Number_in_Array {
    static void main(String[] args) {
        int[] nums={4,5,2,6,8,-6,5,2,0,2,-7};
        int n=nums.length;
        System.out.println("Second Smallest Number :"+second_smallest_number(nums,n));
        System.out.println("Second Largest Number :"+second_largest_number(nums,n));
    }
    static int second_smallest_number(int[] nums,int n){
        int min1=nums[0];//we are initializing the min1 with the firest number in the Array
        int min2=Integer.MAX_VALUE;//We are initializing the min2 with the biggest possible value
        for(int i=0;i<n;i++){
            if(nums[i]<min1){//if nums[i] is less-then min1 we replace the min1 with nums[i]
                min2=min1;//min2 will be replaced with min1 , cause now it is the second-smallest number
                min1=nums[i];//replace min1 with nums[i]
            }
            if(nums[i]>min1 && nums[i]<min2){//if the nums[i] iss greater than min1 but , less-than min2
                min2=nums[i];//nums[i] will become the second-smallest number , because it is less-then the previous min2
            }
        }
        return min2;
    }
    static int second_largest_number(int[] nums,int n){
        int max1=nums[0];//we are initializing the max1 with the firest number in the Array
        int max2=Integer.MIN_VALUE;//We are initializing the max2 with the Smallest possible value
        for(int i=0;i<n;i++){
            if(nums[i]>max1){//if nums[i] is greater-then max1 we replace the max1 with nums[i]
                max2=max1;//max2 will be replaced with max1 , cause now it is the second-largest number
                max1=nums[i];//replace max1 with nums[i]
            }
            if(nums[i]<max1 && nums[i]>max2){//if the nums[i] is less-than max1 but , greater-than min2
                max2=nums[i];//nums[i] will become the second-largest number , because it is greater-then the previous max2
            }
        }
        return max2;
    }
}
