package Week1;

import java.io.*;
import java.util.*;
class DiagonalDifferenceResult {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public  int diagonalDifference(List<List<Integer>> arr) {
    int answ = 0;
    int d1 = 0;
    int d2 = 0;
    int len  = arr.size();
    int ext = len;
    for(int i = 0; i < len; i++){
        d1 = arr.get(i).get(i) + d1;
        d2 = arr.get(i).get(ext-1) + d2;
        ext--;
    }
    answ = Math.abs(d1-d2);
    return answ;

    }

}

public class DiagonalDifference {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> sub = new ArrayList<Integer>();
        List<List<Integer>> input = new ArrayList<List<Integer>>();
        for(int i = 0; i < n; i++){
            sub.add(scanner.nextInt());
            input.add(sub);
        }
        System.out.println(input);
        DiagonalDifferenceResult result = new DiagonalDifferenceResult();
        result.diagonalDifference(input);
        scanner.close();
        // Uncomment the code below to run it on HackerRank;

        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // int n = Integer.parseInt(bufferedReader.readLine().trim());

        // List<List<Integer>> arr = new ArrayList<>();

        // IntStream.range(0, n).forEach(i -> {
        //     try {
        //         arr.add(
        //             Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        //                 .map(Integer::parseInt)
        //                 .collect(toList())
        //         );
        //     } catch (IOException ex) {
        //         throw new RuntimeException(ex);
        //     }
        // });

        // int result = Result.diagonalDifference(arr);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}
