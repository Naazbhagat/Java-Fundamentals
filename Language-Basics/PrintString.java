//Question1-Language Basics
package LanguageBasics;
import java.util.Scanner;
/**
 *
 * @author Naaz
 */
public class PrintString {
    
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string with two arguements");
		String str = scan.nextLine();
		String [] words = str.split(" ");
		System.out.println(words[0]+ " Technologies "+words[1]);
	}
}


