/**
 * Created by Rado on 4/12/14.
 */
public class smMult {
    public static void main(String[] args){
        int prod = 1;

        for(int i = 1; i <= 20; i++){
            if (prod % i != 0) prod*=i;
            System.out.println(i);
            System.out.println(prod);
            System.out.println();
        }

        System.out.println(prod + " is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20");

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