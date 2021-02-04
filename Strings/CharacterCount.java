import java.util.Scanner;

public class CharacterCount {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String stringInput=in.nextLine();
		char[] charArray=stringInput.toCharArray();
		
		int[] countArray=new int[charArray.length];
		int count=1;
		for(int i=0;i<charArray.length;i++) {
			count=1;
			for(int j=0;j<charArray.length;j++) {
				if(i!=j) {
					if(charArray[i]==charArray[j]) {
						count++;
					}
				}
			}
			countArray[i]=count;
		}
		String[] uniqueArray=new String[charArray.length];
		for(int i=0;i<countArray.length;i++) {
			uniqueArray[i]="Total repetations of "+charArray[i]+" is "+countArray[i];
			
		}
		for(int i=0;i<uniqueArray.length;i++) {
			int j=0;
			for (j = 0; j < i; j++)
		         if (uniqueArray[i].compareTo(uniqueArray[j])==0)
		            break;
		         if (i == j)
		        	 System.out.println( uniqueArray[i]);
		     }
		}
	}

