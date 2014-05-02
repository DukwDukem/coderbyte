import java.util.*; 
import java.io.*;

class Function {  
  String SimpleSymbols(String str) { 
  
    // code goes here  
    String[] input = str.split("");
    String[] alpha = "abcdefghijklmnopqrstuvwxyz".split("");
    
    
    for (int i = 0; i < str.length(); i++) {
    		if ( alpha.indexOf(input[i]) != -1 && (input[i-1] != "+" || input[i+1] != "+")) {
    			return "false";
    	}
    }
    /* Using the Java language, have the function SimpleSymbols(str) 
    take the str parameter being passed and determine if it is an 
    acceptable sequence by either returning the string true or false. 
    The str parameter will be composed of + and = symbols with several 
    letters between them (ie. ++d+===+c++==a) and for the string to be 
    true each letter must be surrounded by a + symbol. So the string to 
    the left would be false. The string will not be empty and will have 
    at least one letter. 
    
    Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       
    return "true";
    
  }      
}

class Main {
  public static void main (String[] args) {  
   
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.SimpleSymbols(s.nextLine())); 
    
  }
} 