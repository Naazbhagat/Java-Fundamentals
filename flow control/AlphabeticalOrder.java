//Question 4-Flow Control
package flowControl;


public class AlphabeticalOrder {
    
    public static void main(String[] args) {
        
        String var = "se";
        String temp;
        String [] words = var.split("");
        if(words[0].compareTo(words[1]) > 0){
            temp = words[0];
            words[0] = words[1];
            words[1] = temp;
        }
        System.out.println(words[0]+","+words[1]);
        
    }
}
