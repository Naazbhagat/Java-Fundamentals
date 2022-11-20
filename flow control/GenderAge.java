 //Question 6-Flow Control

package flowControl;

import java.util.Scanner;

public class GenderAge {
    
    public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Gender: ");
		String gender = scan.nextLine();
                System.out.println("Enter the Age: ");
		Integer age = scan.nextInt();
		
                if (gender.equals("Female")){
                    
                    if (age >= 1 && age <=58){
                        
                        System.out.println("Percentage of interest is 8.2%");
                    }
                    else if (age>=59 && age<=100){
                        
                        System.out.println("Percentage of interest is 9.2%");
                    }
                }
                else if (gender.equals("Male")){
                    
                    if (age >= 1 && age <=58){
                        
                        System.out.println("Percentage of interest is 8.4%");
                    }
                    else{
                        
                        System.out.println("Percentage of interest is 10.5%");
                    }
                }
    }                    
}

