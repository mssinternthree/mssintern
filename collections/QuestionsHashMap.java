package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuestionsHashMap {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		HashMap<String,Integer>oanswers=new HashMap();
		oanswers.put("which of the following is a vegetable \n1:brinjal\n2:apple\n3:coconut\n",1);
		oanswers.put("which of the folloing is not a programming language\n1:c\n2:js\n3:python\n",2);
		oanswers.put("which of the folloing is the best \n1:vampire dairesc\n2:originals\n3:legacies\n",3);
		int cans=0;		
		for(Map.Entry<String,Integer> qs:oanswers.entrySet()) {
			System.out.printf("%s",qs.getKey());
			System.out.println("Enter your answer ");
			int i=scan.nextInt();
			if(i==qs.getValue()) {
				cans++;
			}	
		}
		System.out.println("total corrrect annswers :  "+cans);
		if(oanswers.size()==cans) {
			System.out.println("all correct answers");
		}
		
	}

}
