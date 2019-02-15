/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import java.util.Scanner;

/**
 *
 * @author Mohamed
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x ;
      boolean res = false ;
      Integer index = null;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the number to be searched");
      x = s.nextInt();
      int [] numbers = {6,19,65,80,47,66};
      for (int i = 0 ; i <numbers.length ; i++){
          if(numbers[i]== x){
              res = true;
              index=i ;
          }
      }
      
      if (res == true){
          System.out.println("Element is present at "+index);
      }
      else System.out.println("Element is not present at Array");
    }
    
}
