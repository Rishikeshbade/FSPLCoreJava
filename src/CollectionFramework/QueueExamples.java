package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.offer(2);
		queue.offer(4);
		queue.offer(6);
		queue.offer(8);
		
		System.out.println(queue);
		
		System.out.println("Poll: "+queue.poll());
		
		System.out.println(queue);
		
		System.out.println("Remove element: "+queue.remove(4));
		System.out.println(queue);
		
		System.out.println("Peek: "+queue.peek());
		System.out.println(queue);
		
		System.out.println("Element: "+queue.element());
		System.out.println(queue);
		
		System.out.println("Empty: "+queue.isEmpty());
		
		System.out.println(queue);
		
		

	}

}
