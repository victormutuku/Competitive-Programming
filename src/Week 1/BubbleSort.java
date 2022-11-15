import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'countSwaps' function below.
     *
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static void countSwaps(List<Integer> a) {
        int count = 0;
        int larger = 0;
        int smaller = 0;
        int value = a.size();
        List<Integer> b = new ArrayList<Integer>();

        Collections.sort(b);

        for(int i = 0; i < value; i++){
            for(int j = 0; j < value-1; j++){
                if(a.get(j) > a.get(j+1)){
                    count++;
                    smaller = a.get(j+1);
                    larger = a.get(j);
                    a.set(j, smaller);
                    a.set(j+1, larger);
                }else{
                    continue;
                }
            }
        }
        System.out.println("Array is sorted in " + count + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(a.size()-1));
    }

}

public class BubbleSort {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.countSwaps(a);

        bufferedReader.close();

        // Scanner scanner = new Scanner(System.in);
        // int num = scanner.nextInt();
        // List<Integer> input = new ArrayList<Integer>();
        // for(int i = 0; i < num; i++){
        //     input.add(scanner.nextInt());
        // }
        // scanner.close();
        // Result rs = new Result();
        // rs.countSwaps(input);
    }
}
