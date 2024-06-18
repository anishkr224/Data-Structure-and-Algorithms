package QueueArrayImplementation;
public class Queue {
	final int max=5;
	int front,rear;
	int queue[];
	
	Queue(){
		queue=new int[max];
		front=rear=-1;
	}
	
	void insert(int ele){
		if(rear==max-1)
			System.out.println("Overflow");
		else if(front==-1 && rear==-1)
			front=rear=0;
		else
			rear++;
		queue[rear]=ele;
	}
	
	void delete(){
		if(front==-1 && rear==-1)
			System.out.println("Underflow");
		else if(front==rear)
			front=rear=-1;
		else
			front++;
	}
	
	void display(){
		System.out.println("Queue is:");
		for(int i=front;i<=rear;i++)
			System.out.print(queue[i]+" ");
		System.out.println("\nfront="+front+" rear="+rear);
	}
}