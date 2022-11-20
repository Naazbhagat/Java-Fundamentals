//Question 12-Flow Control
package flowControl;

import java.util.Scanner;

public class PrimeNumber { 
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number: ");
        int num = scan.nextInt();
        int temp = 0;
        
        for(int i = 2; i < num/2; i++){
            if(num%i == 0){
                temp++;
            }
            else{
                continue;
            }
        }
        if(temp == 0){
            
            System.out.println("Number is prime");
        }
        else{
            
            System.out.println("Number is not prime");
        }
    }
}

