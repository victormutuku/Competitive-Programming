package Week1_2023;

import java.util.Arrays;

class CommonCharacterCountResult{
    int solution(String s1, String s2) {
        int num = 0;
        int left = 0;
        int right = 0;
        
        char[] s1temp = s1.toCharArray();
        char[] s2temp = s2.toCharArray();
        
        Arrays.sort(s1temp);
        Arrays.sort(s2temp);
        System.out.println(s1temp);
        System.out.println(s2temp);
        
        while(left < s1.length() && right < s2.length()+1){
            if(s1temp[left] == s2temp[right]){
                num ++;
                left++;
                right++;
            }else{
                if(right != s2.length()){
                    right++;
                    if(right == s2.length()){
                        left++;
                        right = 0;
                    }
                }
            }
            
        }
        return num;
    }
}
public class CommonCharacterCount {
    public static void main(String[] args) {
        CommonCharacterCountResult cs = new CommonCharacterCountResult();
        cs.solution("aabcc", "adcaa");
        
    }
}
