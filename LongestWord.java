import java.util.*; 
import java.io.*;

    class Longest {
	
	public String longest(String sen){
		
		String longest;
		
		//filter out all non alpha char
		sen = sen.replaceAll(" ","ZQZ");//Keep the spaces!!!
		sen = sen.replaceAll("\\P{Alnum}", "");//Filter the #$@&^!
		sen = sen.replaceAll("ZQZ", " ");//Put the spaces back in!!!
		
		int i =sen.indexOf(" "); 
		if (i == -1){
			return sen; 
		}

		String first = sen.substring(0,i);
		first = first.trim();
		String rest = sen.substring(i);
		rest = rest.trim();
		
		longest = stringcompare(first, longest(rest));
		
		return longest;
	}

	private String stringcompare(String first, String longest) {
		if (first.length() >= longest.length()) {
			return first;
		}
		else 
			return longest;
	}
}
    
    
    
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       


class Main {
  public static void main (String[] args) {  
   
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Longest c = new Longest();
    System.out.print(c.longest(s.nextLine())); 
    
  }
} 