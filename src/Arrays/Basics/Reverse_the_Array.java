package Arrays.Basics;

public class Reverse_the_Array {
    static void main(String[] args) {
        int[] nums={7,8,5,6,2,4};
        int n=nums.length;
        for(int i:reverse_the_array(nums,n)){
            System.out.print(i+" ");
        }
    }
    static int[] reverse_the_array(int[] nums,int n){//we are using the Two Pointer Approach
        int left=0;//start of the Index
        int right=n-1;//End of the Index
        while (left<right){//As Long as the left is less than Right we run the loop
            int temp=nums[left];//Swap the Elements at both the Ends
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        return nums;
    }
}
