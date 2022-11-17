import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
	
	public static void main(String[] args) {
		
		PriorityQueue<String> queue = new PriorityQueue<String>();
		
		queue.add("amll");
		queue.add("Samll");
		queue.add("riramll");
		queue.add("ramll");
		
		System.out.println("head : "+queue.element());
		System.out.println("head : "+queue.peek());
		System.out.println("iterating the queue elements ");
		
		Iterator t = queue.iterator();
		
		while(t.hasNext()) {
			System.out.println(t.next());
		}
	}

}
