package exceptionHandling;

public class NestedTry {

	public static void main(String[] args) {
		int a=2;
		int b=0;
		int c=0;
		try {
			System.out.println("outer try");
			try {
				System.out.println("inner try"); 
				c=a/b;
				 
					}catch(ArithmeticException e) {
						b+=1;
						c=a/b;
						System.out.println("inner catch");
					}finally{
						System.out.println("inner finally");
					}
		}catch(ArithmeticException e) {
			System.out.println(e.toString());
		}finally{
			System.out.println("please check number");
		}
		try {
		 c=a/b;
			}catch(ArithmeticException e) {
				b+=1;
				c=a/b;
			}finally{
				System.out.println(c);
			}
	}

}
