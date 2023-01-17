package Week1;

import java.util.*;

public class DuplicateNumbers {

    public int removeDuplicates(int[] nums){
        int count = 0;
        List<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(arr.contains(nums[i])){
                continue;
            }else{
                arr.add(nums[i]);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] num = {1,1,2};
        DuplicateNumbers dn = new DuplicateNumbers();
        dn.removeDuplicates(num);
    }
}
