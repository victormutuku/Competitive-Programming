package Week1;

import java.util.*;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> output = new ArrayList<String>();
        for(int i = 1; i < n+1; i++){

            if(i%3 == 0 && i%5 == 0){
                output.add("FizzBuzz");
            }
            if(i%3 != 0 && i%5 == 0){
                output.add("Buzz");
            }
            if(i%3 == 0 && i%5 != 0){
                output.add("Fizz");
            }
            if(i%3 != 0 && i%5 != 0){
                output.add(String.valueOf(i));
            }
        }
        return output;
    }
}
