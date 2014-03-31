/**
 * Created by Rado on 3/31/14.
 */
public class fib {public static void main(String[] args){
    int max = 4000000;
    int sum = 0;

    int i1 = 0;
    int i2 = 1;
    int fib = 0;

    while(fib < max){
        if (fib % 2 == 0){
            sum+=fib;
        }
        fib = i1 + i2;
        i1 = i2;
        i2 = fib;
    }

        System.out.println("The sum of the even-valued terms of the Fibonacci sequence below " + max + " is " + sum);
    }
}
