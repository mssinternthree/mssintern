import java.util.*;

class  Question{
	int qno;
	String question;
	String optA;
	String optB;
	String optC;
	String optD;
	char ans;
	
	void assign(int qno,String question,String optA,String optB,String optC,String optD,char ans,HashMap<Integer,Character> hmobj) {
		this.qno=qno;
		this.question=question;
		this.optA=optA;
		this.optB=optB;
		this.optC=optC;
		this.optD=optD;
		this.ans=ans;
		
		hmobj.put(qno,ans);
	}
}

public class QuestionAnswerHash {
	public static void main(String...args) {
		Scanner in=new Scanner(System.in);
		HashMap<Integer,Character> hmobj=new HashMap();
		
		System.out.println("Enter total number of questions :");
		int no=in.nextInt();
		String question,optA,optB,optC,optD;
		char ans;
		Question obj[]=new Question[no];
		
		for(int i=0;i<no;i++) {
			System.out.println("Enter Question no "+(i+1)+" : ");
			question=in.next();
			in.nextLine();
			System.out.println("Enter Option A : ");
			optA=in.next();
			in.nextLine();
			System.out.println("Enter Option B : ");
			optB=in.next();
			in.nextLine();
			System.out.println("Enter Option C : ");
			optC=in.next();
			in.nextLine();
			System.out.println("Enter Option D : ");
			optD=in.next();
			in.nextLine();
			System.out.println("Enter Answer : ");
			ans=in.next().charAt(0);
			
			obj[i]=new Question();
			obj[i].assign(i+1,question,optA,optB,optC,optD,ans,hmobj);
		}
		
		
		System.out.println("\t\tQuiz Time\t\t");
		System.out.println();
		
		int count=0;
		int anscount=0;
		
		for(Map.Entry<Integer,Character> m1:hmobj.entrySet()) {
			System.out.println(obj[count].qno+" "+obj[count].question);
			System.out.println("A) "+obj[count].optA);
			System.out.println("B) "+obj[count].optB);
			System.out.println("C) "+obj[count].optC);
			System.out.println("D) "+obj[count].optD);
			System.out.println("Enter your answer :");
			ans=in.next().charAt(0);
			if(m1.getKey()==(count+1) && m1.getValue()==ans) {
				System.out.println("Correct Answer");
				anscount++;
			}else {
				System.out.println("Incorrect Answer, Correct Answer is : "+m1.getValue());
			}
			count++;
		}
		
		System.out.println("Total number is correct answers are : "+anscount);
	}
}
