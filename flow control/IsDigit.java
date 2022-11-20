//Question 5-Flow Control
package flowControl;


public class IsDigit {
    
    public static void main(String [] args){
        
        char var = 'u';
        
        if ((var >= 65 && var <= 90) || (var >=97 && var <= 122)){
            
            System.out.println("Alphabet");
        }
        else if(var >= 48 && var <= 57){
            
            System.out.println("Integer");
        }
        else {
            System.out.println("Special Character");
        }
        
    }
    
}
