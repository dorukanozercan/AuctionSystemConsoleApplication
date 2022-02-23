import java.util.*;

public class AuctionSystem {
	
	public static void main(String[] args) {
		int tempnum = 0;
	    LinkedList<String> list = new LinkedList<>();//declaring list
	    Scanner input = new Scanner(System.in);//create a scanner
	    System.out.println("How many participants? ");
	    int nbr = input.nextInt();//read the number of element
	    input.nextLine();
	    tempnum = nbr;
	    do {
	    	System.out.println("What is the name of the bidders? (Write one by one.)");
	        list.add(input.nextLine());//read and insert into the list
	        nbr--;//decrement the index
	    } while (nbr > 0);//repeat until the index will be 0
	    
		int bid;
		String adress;
		String choice;
		int[] arrayBid = new int[list.size()];
		QueueD que = new QueueD();
		
		do {
			System.out.println("CONTROL PANEL: [additem, address, bid, end, nextitem)] (Type exit to quit.)");
			choice = input.nextLine(); //takes answer to what to do
			
			switch (choice) {
			case "bid": 
				for (int i = 0; i < tempnum; i++) {
					System.out.println("Enter " + list.get(i)  +"'s "  + "Bid Value for " + que.q.peek() +":" );
					bid = input.nextInt(); //bid is user entered value
					list.set(i, list.get(i) + " - " + que.q.peek() + ": " + String.valueOf(bid));
					arrayBid[i] = bid;
				}
				break;
			case "additem":
				que.queueAdd();
				System.out.println("item that going to be sold: " + que.q.peek());
				
				break;
			case "nextitem":
				que.queueRemove();
				System.out.println("item that going to be sold: " + que.q.peek());
				break;
			case "address":
				for (int i = 0; i < tempnum; i++) {
					System.out.println("Write " + list.get(i)  + "'s " + "adress:");
					adress = input.nextLine();
					list.set(i, list.get(i) + " - " + adress);
				}
				break;
			case "end":
				MaxHeap maxheap = new MaxHeap(arrayBid);
				maxheap.buildMaxHeap();
				for (int i = 0; i < tempnum; i++) {
					if (list.get(i).contains(String.valueOf(maxheap.findMax()))) {
						System.out.println(que.q.peek() + " shipped to: " + list.get(i));
					} else {
						System.out.println();
					}
				}
				break;
			case "exit":
				return;
			default:
				break;
			}

		} while (choice != "exit");
	}
}

