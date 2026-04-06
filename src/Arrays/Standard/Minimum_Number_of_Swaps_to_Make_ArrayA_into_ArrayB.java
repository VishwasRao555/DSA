package Arrays.Standard;

import java.util.HashMap;
//No Extra Space
public class Minimum_Number_of_Swaps_to_Make_ArrayA_into_ArrayB {//Without Extra Space
    static void main(String[] args) {
        int[] A={20,40,30,10};
        int[] B={10,20,30,40};//Target Array
        int n=A.length;//Length of Both Arrays are Equal
        int count=minimum_number_of_swaps(A,B,n);
        System.out.println(count);

    }
    static int minimum_number_of_swaps(int[] A,int[] B,int n){
        int swap_count=0;//Initializing Count to 0
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(A[i],i);//Add element and its index in HashMap
        }
        for (int i=0;i<n;i++){
            if(A[i]==B[i]) continue;//If the elements in Arrays A are B are same at index i , then we skip the iteration
            //storing the index of element at i in array B , so that we will know what element should we keep inn the array A
            int Correct_Element_Index=map.get(B[i]);//gets the index of element at i in Array B
            //Swaping the Element at i with element at Correct_Element_Index ( Correct_Element_Index represents the element that is at the position i in Array B)
            int temp=A[i];
            A[i]=A[Correct_Element_Index];
            A[Correct_Element_Index]=temp;
            //Update the New Array A in the HashMap
            map.put(A[i],i);//Correct Swaped element
            map.put(A[Correct_Element_Index],Correct_Element_Index);//Another Swaped Element
            swap_count++;//Increase the count
        }
        return swap_count;
    }
}
