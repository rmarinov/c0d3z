/**
 * Created by Rado on 3/27/14.
 */

import java.util.Scanner;
import java.io.*;
import java.math.*;

public class stringPal {
    public static void main(String[] args){
    InputStreamReader istream = new InputStreamReader(System.in);
    BufferedReader bufRead = new BufferedReader(istream);


    System.out.println("Input string to test if palindrome: ");
    Scanner input = new Scanner(System.in);

    String s = input.next();
    float len = s.length();

    int i2 = (int)Math.ceil(len/2);

    char[] test = s.toCharArray();

        boolean isPal = false;

        for(int i = 0; i < i2; i++){
            if( test[i] != test[(int)len-i-1]){
                break;
            }
            if (i >= i2-1){
                isPal = true;
            }
        }

        if(isPal){
            System.out.println("The string " + s + " is a palindrome.");
        }
        else{
            System.out.println("The string " + s + " is not a palindrome.");
        }
    }
}
