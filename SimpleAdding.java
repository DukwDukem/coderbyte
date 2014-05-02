import java.util.*; 
import java.io.*;

class Function {  
  int SimpleAdding(int num) { 
  
    // code goes here   
    int j=0;
    
    for(int i=1; i <= num; i++){
        j += i;
    }
    
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       
    return j;
    
  }      
}

class Main {
  public static void main (String[] args) {  
   
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.SimpleAdding(s.nextLine())); 
    
  }
}   