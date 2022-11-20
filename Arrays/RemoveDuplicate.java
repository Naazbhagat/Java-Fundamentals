//Question7-Arrays
package Arrays;
import java.util.Arrays;

public class RemoveDuplicate {
    
    public static void main(String[] args){
        
        int[] arr = {13, 24, 66, 78, 9, 13, 67, 66};
        Arrays.sort(arr);
        int[] arr1 = new int[arr.length];
        int i,j = 0;
        for(i=0;i<arr.length-1;i++){
            if(arr[i] != arr[i+1]){
                arr1[j++] = arr[i];
            }
        }
        arr1[j++] = arr[arr.length-1];
        for(i=0;i<j;i++){
            System.out.println(arr1[i]);
        }
        
    }
    
}
