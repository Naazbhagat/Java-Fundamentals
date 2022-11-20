//Question10-Arrays
package Arrays;

import java.util.Scanner;

public class EvenOdd {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int len,i,j = 0,count = 0;
        
        System.out.println("Enter the length of array");
        len = scan.nextInt();
        
        int [] arr = new int [len];
        int [] arr1 = new int [len];
        
        System.out.println("Enter the elements of array");
        
        for(i=0;i<arr.length;i++){
            
            arr[i] = scan.nextInt();
        }
        
        System.out.println("The given array: ");
        
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
        for(i=0;i<arr.length;i++){
            
            if(arr[i]%2==0){
                
                arr1[j++] = arr[i];
                count++;
            }
        }
        j = count;
        for(i = 0;i<arr.length;i++){
            
            if(arr[i]%2!=0){
                
                arr1[j] = arr[i];
                j++;
            }  
        }

        System.out.println("The given array after reordering: ");
        
        for(i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}

