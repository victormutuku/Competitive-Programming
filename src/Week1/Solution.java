package Week1;

import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
import java.util.*;
// import java.util.concurrent.*;
// import java.util.function.*;
// import java.util.regex.*;
import java.util.stream.*;
// import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class MiniMaxSumResult {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        int arrlength = arr.size();
        int minsum = 0;
        int maxsum = 0;
        
        Collections.sort(arr);
        
        if(arr.get(0) < 1){
            System.out.println("Invalid value entered");
        } else if(arr.get(arrlength-1) > 1000000000){
            System.out.println("Invalid value entered");
        } else{
           for(int i = 0; i < arrlength-1; i++){
            minsum += arr.get(i);
            }
            for(int i = 1; i < arrlength; i++){
                maxsum += arr.get(i);
            } 
        }
        
        
        System.out.println(minsum + " " + maxsum);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        MiniMaxSumResult.miniMaxSum(arr);

        bufferedReader.close();
    }
}

