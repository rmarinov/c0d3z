/**
 * Created by Rado on 4/17/14.
 */
public class brute {public static void main(String[] args){

    int i = 0;
    int p = 0;
    int stop = 10001;
    while( p != stop){
        i++;
        if(isPrime(i)) p++;
    }

    System.out.println("The #" + stop + " prime number is " + i);
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
