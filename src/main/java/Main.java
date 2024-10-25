/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer in Jan 2024
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Main main = new Main();

        int number = main.getInputNumber();

       //Iteration time
        long startTime1 = System.currentTimeMillis();
        int sum = main.sumOfNumbers(number);
        long endTime1 = System.currentTimeMillis();
        long duration1 = endTime1 - startTime1;
        System.out.println("Iteration method time: " + duration1 + " ms");


        //Gaussian time
        long startTime2 = System.currentTimeMillis();
        int sum2 = main.gaussianSum(number);
        long endTime2 = System.currentTimeMillis();
        long duration2 = endTime2 - startTime2;
        System.out.println("Gaussian method time: " + duration2 + " ms");

        if (duration1 > duration2){
            System.out.println("Gaussian method time is faster!");
        }
        else if (duration2 > duration1){
            System.out.println("Iteration method time is faster!");
        }
        else{
            System.out.println("Both methods take the same time!");
        }

        //Sum
        System.out.println("the sum is " + sum);

    }
    
    // do this one and the lab is complete. really.
    // return the sum of 0 to n... if n == 3, the result should be 6

    public int sumOfNumbers(int n) {
        int total = 0;
        int i = 0;

        while(i<=n){
            total += i;
            i++;
        }
        return total;
    }

    public int gaussianSum(int n){

        int total2 =  (n*(n+1))/2;
        return total2;
    }
    
    
    public int getInputNumber() { // gee, may thi sis useful in another lab?
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        return num;
    }
    
    
    
    // for Extra Credit
    //int gaussianSumOfNumbers(int n) {
        //return 0;
    //}
   
    // for Extra extra credit - compare the methods and show which one is faster
    // google "how to time some java code"
    // use "System.currentTimeMillis()" to ask the system what time it is.
}
