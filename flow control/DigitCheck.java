//Question 1-Flow Control
package flowControl;
import java.util.Scanner;
/**
 *
 * @author Naaz
 */
public class DigitCheck {
    
    public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two integers: ");
		Integer num = scan.nextInt();
		Integer num1 = scan.nextInt();
		Integer temp = num;
		
		for(int i=0;i<2;i++) {
			if (temp < 0)
				System.out.println("Negative");
			else if (temp > 0)
				System.out.println("Positive");
			else
				System.out.println("Zero");
			temp = num1;
		}

                if ((num%10)==(num1%10)){
                    System.out.println("True");
                }
                else{
                    System.out.println("False");
                }
    }

}
