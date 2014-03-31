/**
 * Created by Rado on 3/31/14.
 */

import java.io.*;

public class main {
    public static void main(String[] args){
        int max = 1000;
        int sum = 0;
            for(int i = 0; i < max; i++){
                if (i % 5 == 0 || i % 3 == 0){
                    sum+=i;
                }
            }

        System.out.println("The sum of all the multiples of 3 or 5 below " + max + " is " + sum);
    }
}


