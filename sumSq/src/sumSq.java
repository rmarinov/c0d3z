/**
 * Created by Rado on 4/17/14.
 */
public class sumSq {
    public static void main(String[] args){

    int sq = 0;
    int sum = 0;

    for (int i = 1; i <= 100; i++){
        sq+= Math.pow(i,2);
        sum+=i;
    }
    int diff = (int)Math.pow(sum,2) - sq;
    System.out.println("The difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is " + diff);

    }
}
