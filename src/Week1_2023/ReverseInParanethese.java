package Week1_2023;

import java.util.*;

class RevSolution{

    String solution(String inputString) {
        String sol = "";
        
        ArrayList<Integer> index = new ArrayList<Integer>();
        ArrayList<Character> rev = new ArrayList<Character>();
        ArrayList<Character> temp= new ArrayList<Character>();
        
        for(int i = 0; i < inputString.length(); i++){
            temp.add(inputString.charAt(i));
        }
        
        int i = 0;
        while(i < inputString.length()){
            if(inputString.charAt(i) == '('){
                while(inputString.charAt(i)!= ')'){
                    i++;
                    if(inputString.charAt(i) == ')'){
                        continue;
                    }
                    index.add(i);
                    rev.add(inputString.charAt(i));
                }
            } else {
                i++;
            }
        }
        
        Collections.reverse(rev);
        
        int k = 0;
        
        for(int j = 0; j < inputString.length(); j++){
            if(k == index.size()){
                break;
            }else{
                int id = index.get(k);
                if(j == id){
                    temp.set(j, rev.get(k));
                    k++;
                }else{
                    continue;
                }
            }
        }
        int m = 0;

        while(m < inputString.length()){
            if(m >= temp.size()){
                break;
            }
            if(temp.get(m) == '(' || temp.get(m) == ')'){
                temp.remove(m);
                m++;
            }else{
                m++;
            }
        }

        for(int n = 0; n<temp.size(); n++){
            sol += temp.get(n);
        }
        System.out.println("Reversed: "+sol);
        
        return sol;
    }
    
}

// The correct answer
class CorrectSol{
    String solution(String inputString) {
        StringBuilder str = new StringBuilder(inputString);
        int start, end;
        while(str.indexOf("(") != -1){
            start = str.lastIndexOf("(");
            end = str.indexOf(")", start);
            str.replace(start, end + 1, new StringBuilder(str.substring(start+1, end)).reverse().toString());
        }
        return str.toString();
    }
}
public class ReverseInParanethese {
    public static void main(String[] args) {
        String s1 = "(bar)";
        String s2 = "foo(bar)baz";
        String s3 = "foo(bar)baz(blim)";
        RevSolution rev = new RevSolution();
        rev.solution(s1);
        rev.solution(s2);
        rev.solution(s3);
    }
}
