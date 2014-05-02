import java.util.*; 
import java.io.*;

class Function {  
  String LetterChanges(String str) { 
  		
		StringBuilder sb = new StringBuilder();

		String[] alpha = "abcdefghijklmnopqrstuvwxyz".split("");
		String[] input = str.split("");
		
		
		for (int j = 1; j < input.length; j++) {
			
			for (int i = 1; i < alpha.length; i++) {
				if(input[j].equalsIgnoreCase("z")){
					input[j] = "A";
					break;
					
				} else if(input[j].equalsIgnoreCase("d")){
					input[j] = "E";
					break;
				} else if(input[j].equalsIgnoreCase("h")){
					input[j] = "I";
					break;
				} else if(input[j].equalsIgnoreCase("n")){
					input[j] = "O";
					break;
				}else if(input[j].equalsIgnoreCase("t")){
					input[j] = "U";
					break;
				}
				else if(input[j].equalsIgnoreCase(alpha[i])) {
					input[j] = alpha[i+1];
					break;
				}
			}
		}
		
		for (String string : input) {
			sb.append(string);
		}

		
		String str1 = sb.toString();
		return str1;
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       

    
  }      
}

class Main {
  public static void main (String[] args) {  
   
    // keep this function call here     
		Function c = new Function();
		System.out.println(c.LetterChanges(new Scanner(System.in).nextLine()));
    
  }
}   