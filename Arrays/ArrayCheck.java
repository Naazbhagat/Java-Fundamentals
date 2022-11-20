//Question3-Arrays
package Arrays;

public class ArrayCheck {
    
    public static void main(String[] args){
        
        int[] arr = {86,20,30,59,33,22};
        int num = 30, temp = 0, i;
        
        for(i=0;i<arr.length;i++){
            
            if(arr[i] == num){
                
                temp = 1;
                break;
            }
        }
        if(temp == 1){
            
            System.out.println(i+1);
        }
        else{
            System.out.println("-1");
        }
    }
    
}
