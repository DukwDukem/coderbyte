package abcheck;

import java.util.*; 
import java.io.*;

public class Function {
	  String ABCheck(String str) { 
		  
		    // code goes here   

		    String[] input = str.split("");


		    for (int j =0; j < (str.length()-3); j++){
		      if ( input[j].equalsIgnoreCase("a") && input[j+4].equalsIgnoreCase("b") ){
		              return "true";
		        }
		      }
		    /* Note: In Java the return type of a function and the 
		       parameter types being passed are defined, so this return 
		       call must match the return type of the function.
		       You are free to modify the return type. */
		       
		    return "false";
		    
		  } 
		  
		  public static void main (String[] args) {  
		    // keep this function call here     
		    Scanner  s = new Scanner(System.in);
		    Function c = new Function();
		    System.out.print(c.ABCheck(s.nextLine())); 
		  }   
		  

}
