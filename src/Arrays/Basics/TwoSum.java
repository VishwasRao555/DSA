package Arrays.Basics;

public class TwoSum {
    //Using Two Pointer for Sorted Array...
    static int[] twosum_for_sorted_Array(int[] nums1,int target){
           int left=0;
           int right=nums1.length-1;
           int[] result=new int[2];
           while(left<right){
               int l=nums1[left];
               int r=nums1[right];
               int sum=l+r;
               if(sum==target){
                   result[0]=left;
                   result[1]=right;
                   return result;//or directly we can write--> return new int[] {left,right};
               }
               if(sum>target) right--;
               if(sum<target) left++;

           }
          return new int[] {};
    }

    static void main(String[] args) {
        int[] nums1={1,3,5,7,9};
        int target=6;
        int[] result=twosum_for_sorted_Array(nums1,target);
        for(int i:result){
            System.out.print(i+" ");
        }

    }
}
