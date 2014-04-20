/**
 * Created by Rado on 4/1/14.
 */
public class palProd {    public static void main(String[] args){

    boolean done = false;

    for(int a = 999; a > 900; a--){
        for(int b = 999; b > 900; b--){
            if (isPal(a*b)){
                System.out.println("The number " + a*b + ", product of " + a + " and " +  b  + " is the largest palindrome made from the product of two 3-digit numbers.");
                done = true;
                break;
            }
        }
        if (done) break;
    }


    }

    public static boolean isPal(int num){
        char[] test = String.valueOf(num).toCharArray();
        for(int i = 0; i < test.length/2; i++){
            if( test[i] != test[test.length-i-1]) return false;
        }
        return true;
    }
}

