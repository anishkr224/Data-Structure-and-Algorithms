import java.util.Scanner;
public class LinkedList {
	Node start;
	Scanner sc=new Scanner(System.in);
	void create()
	{
		Node p=new Node();
		System.out.println("Input regdno and mark");
		p.regdNo=sc.nextInt();
		p.mark=sc.nextFloat();
		p.link=null;
		start=p;
		System.out.println("Do you want to add more nodes(0/1):");
		int ch=sc.nextInt();
		while(ch!=0)
		{
			Node q=p;
			p=new Node();
			System.out.println("Input regdno and mark");
			p.regdNo=sc.nextInt();
			p.mark=sc.nextFloat();
			p.link=null;
			
			q.link=p;
			
			System.out.println("Do you want to add more nodes(0/1):");
			ch=sc.nextInt();
		}
	}
	void display()
	{
		System.out.println("The Linked List is:");
		System.out.println("start="+start);
		Node p=start;
		while(p!=null)
		{
			System.out.println(p.regdNo+"  "+p.mark+"  "+p.link);
			p=p.link;
		}
	}
	int count()
	{
		int c=0;
		Node p=start;
		while(p!=null)
		{
			c++;
			p=p.link;
		}
		return c;
	}
	Node search(int reg)
	{
		Node p=start;
		while(p!=null)
		{
			if(p.regdNo==reg)
				return p;
			p=p.link;
		}
		return null;
	}
	void insBeg()
	{
		Node p=new Node();
		System.out.println("Input regdNo and mark:");
		p.regdNo=sc.nextInt();
		p.mark=sc.nextFloat();
		p.link=null;
		
		p.link=start;
		start=p;
	}
	void insEnd()
	{
		Node p=new Node();
		System.out.println("Input regdNo and mark:");
		p.regdNo=sc.nextInt();
		p.mark=sc.nextFloat();
		p.link=null;
		
		if(start==null)
		{
			start=p;
		}
		else
		{
			Node q=start;
			while(q.link!=null)
			{
				q=q.link;
			}
			q.link=p;
		}
	}
	void insAny()
	{
		System.out.println("Input node no. to insert");
		int loc=sc.nextInt();
		int c=count();
		if(loc<1 || loc>c+1)
		{
			System.out.println("Invalid node no. to insert.");
			return;
		}
		else
		{
			if(loc==1)
				insBeg();
			else if(loc==c+1)
				insEnd();
			else
			{
				Node p=new Node();
				System.out.println("Input regdNo and mark:");
				p.regdNo=sc.nextInt();
				p.mark=sc.nextFloat();
				p.link=null;
				
				int i=1;
				Node q=start;
				while(i<loc-1)
				{
					i++;
					q=q.link;
				}
				p.link=q.link;
				q.link=p;
			}
		}
	}
	void delBeg()
	{
		if(start==null)
			System.out.println("Underflow");
		else
		{
			Node p=start;
			start=start.link;
			p.link=null;        // not required
			p=null;
		}
	}
	void delEnd()
	{
		if(start==null)
			System.out.println("Underflow");
		else if(start.link==null)
			start=null;
		else
		{
			Node p=start;
			while(p.link.link!=null)
				p=p.link;
			p.link=null;
		}
	}
	void delAny()
	{
		System.out.println("Input node no. to delete");
		int loc=sc.nextInt();
		int c=count();
		if(loc<1 || loc>c)
		{
			System.out.println("Invalid node no. to delete");
			return;
		}
		else
		{
			if(loc==1)
				delBeg();
			else if(loc==c)
				delEnd();
			else
			{
				int i=1;
				Node p=start;
				while(i<loc-1)
				{
					i++;
					p=p.link;
				}
				Node q=p.link;
				
				p.link=p.link.link;
				q.link=null;      // not required
				q=null;           // not required
			}
		}
	}
	void reverse()
	{
		Node p=start,q=start.link,r=start.link.link;
		p.link=null;
		q.link=p;
		while(r!=null)
		{
			p=q;
			q=r;
			r=r.link;
			q.link=p;
		}
		start=q;
	}
	void sort()
	{
		Node i,j;
		for(i=start;i.link!=null;i=i.link)
		{
			for(j=start;j.link!=null;j=j.link)
			{
				if(j.mark > j.link.mark)
				{
					int t1=j.regdNo;
					j.regdNo=j.link.regdNo;
					j.link.regdNo=t1;
					
					float t2=j.mark;
					j.mark=j.link.mark;
					j.link.mark=t2;
				}
			}
		}
	}
}