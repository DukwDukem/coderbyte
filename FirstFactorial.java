/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author lucwes
 */
import java.util.*; 
import java.io.*;
import java.math.BigInteger;


public class FirstFactorial {
    
    public BigInteger FirstFactorial(int num) { 
  
    // code goes here 
    BigInteger n = BigInteger.ONE;
    for (int i = 1; i <= num; i++) {
     n = n.multiply(BigInteger.valueOf(i)); 
    }
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */   
    
    return n;
    
  }  
}
class Main {
  public static void main (String[] args) {  
    
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    FirstFactorial c = new FirstFactorial();
    System.out.print(c.FirstFactorial(s.nextLine())); 
    
  }
} 
