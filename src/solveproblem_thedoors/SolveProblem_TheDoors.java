

package solveproblem_thedoors;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Object;


public class SolveProblem_TheDoors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] zero_or_one_array = new int[n];
        
        for(int i = 0 ; i<n ;i++)
        {
            zero_or_one_array[i] = sc.nextInt();
        }
              
        boolean y = true;
        int current_number = 0 ; 
        int current_array_index = 0;
        
        for(int j = 0 ; y == true ; j++ )
        {
            current_number = zero_or_one_array[j];
            ArrayUtils.removeElement(current_array_index, j);
            zero_or_one_array[j] = -1;
            
            if(!contains(zero_or_one_array, current_number))
            {
                current_array_index ++;
                break;
            }
            else
            {
                current_array_index = j+1 ;
            }
            
        }
 
        System.out.println(current_array_index);
}
    
     public static boolean contains(final int[] arr, final int key) {
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }
}