// CODE WRITTEN BY DORUKAN OZERCAN ALL RIGHTS RESERVED

import java.util.*;

public class QueueD {
	
	Queue<String> q = new LinkedList<>();
	String items;
	
	public void queueAdd() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many items?");
		int count = input.nextInt();
		
		for (int i = 0; i < count; i++) {
			System.out.println("type item to add:");
			items = input.next();
			q.add(items);
		}
		
		System.out.println("elements of queue:" + q);
	}
	// CODE WRITTEN BY DORUKAN OZERCAN ALL RIGHTS RESERVED	
	public void queueRemove() {
		q.remove(q.peek());
		System.out.println("elements after remove " + q);
		
	}
}

//CODE WRITTEN BY DORUKAN OZERCAN ALL RIGHTS RESERVED