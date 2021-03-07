/************************************************************** 
 * Purpose/Description: <a brief description of the program>
Author’s Panther ID: *******
Certification:
I hereby certify that this work is my own and none of it is the work of any other person.
**************************************************************/


import java.util.Scanner;


public class assignment1 {
    
     public static void main(String[] args){
        int start,end,mid;
        int[] a = new int[11];
        Scanner sc = new Scanner(System.in);
        a[0] = 1;
        a[1] = 3;
        a[2] = 4;
        a[3] = 5;
        a[4] = 7;
        a[5] = 14;
        a[6] = 11;
        a[7] = 7;
        a[8] = 2;
        a[9] = -4;
        a[10] = -8;
       
        int start1 = 0;
        int end1 = 5;
        int start2 = 6;
        int end2 = 10;
        System.out.println("Enter the number to be serched: ");
        int num = sc.nextInt();
        start = start2;
        end = end2;
        int found = 0;
        while(start <= end){
               mid = (start + end)/2;
               if (num == a[mid]){
                  System.out.println(num+ " found at " + " index " + mid );
                  found = 1;
                  break;               
               }
               if (num > a[mid]){
                  end = mid - 1;
                  start = mid+1;
               }
               if (num < a[mid]){
                   start = mid+1;
               }
              
        }
        start = start1;
        end = end1;
        if (found == 1)
           return;
        while(start <= end){
               mid = (start + end)/2;
               if (num == a[mid]){
                  System.out.println(num+ " found at " + " index " + mid);
                  break;               
               }
               if (num > a[mid]){
                  start = mid + 1;
                 
                 
               }
               if (num < a[mid]){
                   end = mid -1;
                   
               }
        }          
    }
    
}
