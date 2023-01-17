package Week1_2023;

class IsLuckyResult{
    boolean solution(int n) {
        String temp = Integer.toString(n);
        int[] num = new int[temp.length()];
        
        int left=  0;
        int right = temp.length()/2;
        int sumleft = 0;
        int sumright = 0;
        
        for(int i = 0; i < temp.length(); i++){
            num[i] = Character.getNumericValue(temp.charAt(i));
        }
        
        while(right < temp.length()){
            if(left < right){
            sumleft += num[left];
            left++;
            }
            sumright += num[right];
            right++;
        }
        return sumleft == sumright;
    }
    
}
public class IsLucky {
    public static void main(String[] args) {
        IsLuckyResult rs = new IsLuckyResult();
        rs.solution(1230);
    }
}
