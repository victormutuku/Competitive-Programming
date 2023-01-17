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


/*
 * Solved in 34 mins
 */
class PlusMinusResult {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        Double countpositive = 0.0;
        Double countnegative = 0.0;
        Double countzero = 0.0;
        Double inputlength = Double.valueOf(arr.size());
        
        for(int i = 0; i < inputlength; i++){
            // if(arr.get(i) < -100){
            //     break;
            // }else if(arr.get(i) > 100){
            //     break;
            // }else{
                if(arr.get(i) == 0){
                    countzero++;
                }
                if(arr.get(i) < 0){
                    countnegative++;
                }
                if(arr.get(i) > 0){
                    countpositive++;
                }
            // }
        }
        
        Double ratiopositive = countpositive/inputlength;
        Double rationegative = countnegative/inputlength;
        Double ratiozero = countzero/inputlength;
        
        System.out.println(ratiopositive);
        System.out.println(rationegative);
        System.out.println(ratiozero);

    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        PlusMinusResult.plusMinus(arr);

        bufferedReader.close();
    }
}
