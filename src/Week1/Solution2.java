package Week1;

import java.io.*;

class TimeConversionResult {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        String cvttime = "";
        String hour = String.valueOf(s.charAt(0)) + String.valueOf(s.charAt(1));
        int hourcvt = Integer.valueOf(hour);
    
        String remaining = String.valueOf(s.charAt(2)) + String.valueOf(s.charAt(3)) + String.valueOf(s.charAt(4)) + String.valueOf(s.charAt(5)) + String.valueOf(s.charAt(6)) + String.valueOf(s.charAt(7));
    String timeofDay = String.valueOf(s.charAt(8));
    
    
        if(timeofDay.contains("A")){
            if(hour.contains("12")){
                hour = "00";
                cvttime = hour + remaining;
            }else{
                cvttime = hour + remaining;
            }
            
        } else {
            if(hour.contains("12")){
                cvttime = hour + remaining;
            }else{
                hourcvt = hourcvt + 12;
                cvttime = hourcvt + remaining;
            }
            
        }
        return cvttime;
        }

}

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = TimeConversionResult.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
