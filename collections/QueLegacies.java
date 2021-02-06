package collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
public class QueLegacies {

	public static void main(String[] args) {
		  Queue<Integer> pq = new PriorityQueue<>(); 
		 pq.add(1);
		 pq.add(2);
		 pq.add(3);
		 pq.add(4);
		 pq.add(5);
		 Iterator<Integer> i= pq.iterator();
	        while (i.hasNext()) { 
	            System.out.println(i.next() ); 
	        } 
	}
}
