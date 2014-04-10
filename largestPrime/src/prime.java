/**
 * Created by Rado on 3/31/14.
 */

import java.math.*;

public class prime {public static void main(String[] args){
    long testNum = 600851475143L;
//    long testNum = 13195;
//    long testNum = 14;


    long div = (long)Math.sqrt((double)testNum);

    while(div > 1){
        if (testNum % div == 0){
            if(isPrime(div)){
                break;
            }
        }
        div--;
    }

    if(isPrime(testNum/div)){
        if (testNum/div > div){
            div = testNum/div;
        }
    }
    System.out.println("The largest prime factor of the number " + testNum + " is " + div);

}
    public static boolean isPrime(long num){
        if(num == 1) return false;
        for(long i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
