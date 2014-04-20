/**
 * Created by Rado on 4/1/14.
 */


// 232792560


import java.util.ArrayList;

public class smMult {    public static void main(String[] args){

    int testNum = 20;

    ArrayList<Integer> facs = primeFac(testNum);
    ArrayList<Integer> nums = new ArrayList<Integer>();

    Integer prod = 1;

    for(int num = testNum; num > 0; num--){
        boolean add = true;
        for(int num2 = testNum; num2 > num; num2--){
            System.out.println("testing" + num + " " + num2);
            if(num2 % num == 0 || (nums.contains(num))) {
                add = false;
                System.out.println(num + " " + num2 + " fails");
                break;
            }
        }
        if (add) nums.add(num);
        if (add) System.out.println(primeFac(num));
    }

    for(int i = 0; i < nums.size(); i++){
        ArrayList<Integer> temp = primeFac(nums.get(i));
        for(int j = 0; j < temp.size(); j++){
            if (!(facs.contains(temp.get(j)))) facs.add(temp.get(j));
        }
    }

    for(int i = 0; i < facs.size(); i++){
        prod*=facs.get(i);
    }


    System.out.println(nums.toString());
    System.out.println(facs.toString());
    System.out.println(prod.toString());


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

    public static ArrayList<Integer> primeFac(int num){
        ArrayList<Integer> facs = new ArrayList<Integer>();
        for(int i = 1; i <= num; i++){
            while(isPrime(i) && num % i == 0){
                num/=i;
                facs.add(i);
            }
        }
        return facs;
    }
}

//System.out.println(num);
//ArrayList<Integer> temp = new ArrayList<Integer>();
//temp = primeFac(num);
//for(int i = 0; i < temp.size(); i++){
//facs.add(temp.get(i));
//}