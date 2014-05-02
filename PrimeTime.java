import java.util.*; 
import java.io.*;

class Function {  
  String PrimeTime(int num) { 
  
    // code goes here   
    		if (num == 2) {
			return "true";
		} else
			for (int i = 2; i < num; i++) {

				if (num % i == 0)
					return "false";
			}
		return "true";
	}
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */      
}

class Main {
  public static void main (String[] args) {  
   
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.PrimeTime(s.nextLine())); 
    
  }
}          