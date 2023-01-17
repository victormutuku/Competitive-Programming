package Week1;

import java.util.ArrayList;
import java.util.List;

class ValidateSubsequenceResult {
    public boolean validate(List<Integer> arr, List<Integer> sequence) {
        boolean ans = false;
        int count = 0;
        List<Integer> newarray = new ArrayList<Integer>();
        // remove duplicate values
        for(int k = 0; k < arr.size(); k++){
            if(!newarray.contains(arr.get(k))){
            newarray.add(arr.get(k));
            }
        }

        for(int i = 0; i < sequence.size(); i++){
            for(int j = 0; j < newarray.size(); j++) {
                if(sequence.get(i)==newarray.get(j)){
                    count++;
                }
            }
        }

        if(count == sequence.size()){
            ans = true;
        }

        return ans;
    }

}

public class ValidateSubsequence {
    public static void main(String[] args) {
        List<Integer>arr = new ArrayList<Integer>();
        arr.add(5);
        arr.add(1);
        arr.add(22);
        arr.add(25);
        arr.add(6);
        arr.add(-1);
        arr.add(8);
        arr.add(10);
        
        List<Integer> seq = new ArrayList<Integer>();
        arr.add(1);
        arr.add(6);
        arr.add(-1);
        arr.add(5);
        
        ValidateSubsequenceResult rs = new ValidateSubsequenceResult();
        System.out.println(rs.validate(arr, seq)); 
        
    }
}