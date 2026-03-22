package Arrays.Basics;
//Brute Force
public class Find_All_SubArrays_of_Arrays {
   public static void main(String[] args) {
       int[] array = {1, 2, 3, 4, 5};//Works For Both Sorted and UnSorted
       int n=array.length;
       //Total SubArrays of an Array of length "n" = n(n+1)/2
       //We use Two loops Outer and Inner to Find All the Subarrays
       for(int i=0;i<n;i++){ //Outer Loop -->(Represents Each Element in Arrray)
           for(int j=i;j<n;j++){ // Inner Loop -->(Each Subarray)
               for(int k=i;k<=j;k++){// Each Element in a SubArray
                   System.out.print(array[k]+" ");
               }
               System.out.println();//to move the next line
           }
       }
   }
}
