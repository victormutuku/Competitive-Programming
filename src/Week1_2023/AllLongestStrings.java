package Week1_2023;

import java.util.*;

class AllLongestStringsResult{
    String[] longStringSolution(String[] inputArray) {
        String[] longestStrings = new String[inputArray.length];
        ArrayList<String> clonedInput = new ArrayList<String>();
        
        if(inputArray.length == 1){
            longestStrings[0] = inputArray[0];
        } else{
            for(int i = 0; i < inputArray.length; i++){
                clonedInput.add(inputArray[i]);
            }
            Collections.sort(clonedInput, (a,b)->Integer.compare(a.length(), b.length()));

            String laString = clonedInput.get(clonedInput.size()-1);
            int lastlen = laString.length();
            System.out.println(lastlen);

            for(int i = clonedInput.size()-1; i >= 0; i--){
                String val = clonedInput.get(i);
                int len = val.length();
                System.out.println(len);

                if(len < lastlen){
                    clonedInput.remove(i);
                }
            }
            
        }
        for(int i = 0; i < clonedInput.size(); i++){
            System.out.println("Sorted "+clonedInput.get(i));
        }
        return longestStrings;
    } 
}
public class AllLongestStrings{
    public static void main(String[] args) {
        String[] input1 = {"aba", "aa", "ad", "vcd", "aba"};
        
        AllLongestStringsResult ls = new AllLongestStringsResult();
        ls.longStringSolution(input1);
    }
}