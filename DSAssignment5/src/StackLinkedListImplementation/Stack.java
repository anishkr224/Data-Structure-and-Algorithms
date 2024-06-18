package StackLinkedListImplementation;
public class Stack {
	Node top;
	
	void push(int ele){
		Node p=new Node();
		p.info=ele;
		p.link=null;
		
		p.link=top;
		top=p;
	}
	
	void pop(){
		if(top==null){
			System.out.println("Underflow");
		}else{
			Node p=top;
			top=top.link;
			p.link=null;     // last two steps are not required
			p=null;
		}
	}
	
	void display(){
		System.out.println("The stack is:");
		System.out.println("top="+top);
		Node p=top;
		while(p!=null){
			System.out.println(p.info+"  "+p.link);
			p=p.link;
		}
	} 
}