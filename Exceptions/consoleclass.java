package Exceptions;
import java.io.*; 
public class consoleclass {
	  public static void main(String[] args) {
		Console obj=System.console();
		System.out.println("enter your name");
		char ch[]=obj.readPassword();
		System.out.println(ch);
		
	} 
	
}
