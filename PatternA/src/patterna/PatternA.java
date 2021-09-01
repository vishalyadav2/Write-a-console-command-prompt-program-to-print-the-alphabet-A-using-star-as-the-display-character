
package patterna;

import java.util.Scanner;


public class PatternA {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of row");
        int rows = sc.nextInt();
        System.out.println("Enter number of times you want to print pattern in horizontal : ");
        int counter = sc.nextInt();
        
        
         for (int i = 0; i < rows; i++) {
 
            for(int k=1; k<=counter; k++){
            for (int j = 0; j <= rows / 2; j++) {
 
                
                if ((j == 0 || j == rows / 2) && i != 0 ||
 
                   
                    i == 0 && j != 0 && j != rows / 2 ||
 
                   
                    i == rows / 2)
 
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for(int j = 0;j<20;j++){
                System.out.print(" ");
            }
            }
 
            System.out.println();
        }
        
        
    }
    
}
    
