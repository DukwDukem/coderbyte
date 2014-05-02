import java.util.*; 
import java.io.*;

class Function {  
  String CheckNums(int num1, int num2) { 
    
      if (num1 < num2){
      return "true";
    } else if (num1 > num2) {
      return "false"; 
    } else return "-1";
    // code goes here   
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
    System.out.print(c.CheckNums(s.nextLine())); 
    
  }
}           
