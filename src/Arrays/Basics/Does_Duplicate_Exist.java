package Arrays.Basics;

import java.util.HashSet;

public class Does_Duplicate_Exist {
    static boolean Duplicate_Exist(int[] nums){
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums){
            if(set.contains(n)) return true;
            set.add(n);
        }
        return false;
    }

    static void main(String[] args) {
        int[] nums={1,2,4,6,1};
        System.out.println(Duplicate_Exist(nums));
    }
}
