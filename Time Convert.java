import java.util.*; 
import java.io.*;
import java.math.BigDecimal;

class Function {  
  public String TimeConvert(int num) { 
  
    // code goes here   
    	String time;
		BigDecimal big = new BigDecimal(num/60);
		

		if (num < 60) {
			time = "0:" + num;
		} else if (num % 60 == 0) {
			
			big.precision();
			
			time = big.toString() + ":00";
		} else {
			
			big.precision();
			
			time = big.toString() + ":" + (num % 60);
		}
    
    return time;
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    
  }   
}

class Main {
  public static void main (String[] args) {  
   
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.TimeConvert(s.nextLine())); 
    
  }
}  