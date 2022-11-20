//Question14-Arrays
package Arrays;

import java.util.Scanner;

public class LargestIn3dArray {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 9 numbers");
        int [][] arr = new int [3][3];
        int max = 0;
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("The given array is");
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("The biggest number in the given array is "+max);
    }
        
}
