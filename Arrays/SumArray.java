//Question8-Arrays
package Arrays;

public class SumArray {
    
    public static void main(String[] args){
        
        int[] arr = {10,20,6,9,8,2,7,1,2};
        int sum = 0, temp = 0;
        for(int i=0;i<arr.length;i++){
            
            if(arr[i] == 6){
                temp = 1;
            }
            else if(arr[i] == 7){
                
                temp = 0;
                i++;
            }
            if(temp != 1){
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }
    
}
