package Week1;

import java.util.*;

public class BoatstoSavePeople {
    public int numRescueBoats(int[] people, int limit){
        Arrays.sort(people);
        int boat = 0;
        int light = 0;
        int heavy = people.length-1;

        while(light <= heavy){
            if(people[light] + people[heavy] <= limit){
                light++;
                heavy--;
            }
            else{
                heavy--;
            }
            boat++;
        }

        return boat;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,3,4};
        int lim = 5;
        BoatstoSavePeople bs = new BoatstoSavePeople();
        System.out.println(bs.numRescueBoats(arr, lim)); 

    }
}
