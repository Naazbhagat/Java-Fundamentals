//Question1-Arrays
package Arrays;

import java.util.Scanner;

public class SumAvg {
    
    public static void main(String[] args){
        
        int[] arr = {10, 20, 30, 40, 50, 60};
        int sum = 0;
        double avg;
        
        System.out.println("Array");
        
        for(int i=0;i<arr.length;i++){
            
            sum = sum + arr[i];
        }
        System.out.println("The sum of the array: "+sum);
        avg = (sum/arr.length);
        System.out.println("The average of the array is: "+avg);
    }
    
}
