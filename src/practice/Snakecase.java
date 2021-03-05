package practice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Snakecase {

	  public static String SnakeCase(String str) {
	    StringBuilder sb=new StringBuilder("");
	    for(int i=0;i<str.length();i++){
	      if(Pattern.matches("[a-zA-Z]", (str.charAt(i)+""))){
	        sb.append((str.charAt(i)+""));
	      }else{
	        sb.append(("_"));
	      }
	    }
	    return sb.toString().toLowerCase();
	  }

	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.print(SnakeCase(s.nextLine())); 
	  }

}