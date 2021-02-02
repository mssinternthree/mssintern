import java.util.Scanner;
 
public class menudrivencalculator
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter your choice:");
  System.out.println("1.addition 2.substraction 3.multiplication");
  int choice = sc.nextInt();
  System.out.println("enter a number");
  int num1=sc.nextInt();
  System.out.println("enter a number");
  int num2=sc.nextInt();
  switch(choice)
  {
  case 1:{
	  System.out.println(num1+num2);  
	  break;
  }
  case 2:{
	  System.out.println(num1-num2);  
	  break;
  }
  case 3:{
	  System.out.println(num1*num2);  
	  break;
  }
  }
}
 }