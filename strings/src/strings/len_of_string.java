package strings;
import java.util.Scanner;
   public class len_of_string {
  public static void main(String[] args)
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter String to find its length:");
  String str=sc.nextLine();
  str=str+"\0";
  int i=1,count=1;
  while(str.charAt(i)!='\0')
  {
  count=count+1;
      i=i+1;
  }
 
  System.out.println("Length of string :"+count);
 
 
  }
   }


