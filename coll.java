import java.util.*;
class alist
{
		private int x[];
		private int p;
		private int o;
		private int u;
		alist(int p)
		
		
		
		
		{
			this.p=p;
			o=p;
			u=-1;
			x=new int[p];
		}
		
		
		
		
		
		public void traverse()
		{
			if(u==-1)
				System.out.println("List is empty.");
			else
			{
				for(int i=0;i<=u;i++)
					System.out.print(x[i]+" ");
				System.out.println();
				
				
				
			}
			
			
			
			
		}
		
		
		
		public void add(int data)
		{
			if(u==p-1)
			{ 
				int temp[]=x;
				this.p=(int)(this.p*1.5);
				x=new int[this.p];
			}
			
			
			
			
			u++;
			x[u]=data;
		}
		
		
		
		
		public int getIndex()
		{
			return u;
		}
		public void delete(int data)
		{
			if(u==-1)
				System.out.println("List is empty.");
			else
			{
				int  pos=-1;
				for(int i=0;i<=u;i++)
				{
					if(x[i]==data)
					{
						pos=i;
						break;
					}
				}
				if(pos==-1)
					System.out.println(data+" was not found in the arraylist.");
				else
				{
					for(int i=pos;i<u;i++)
						x[i]=x[i+1];
					x[u]=-988;
					u--;
				}
			}
		}
		public void deleteall()
		{
			if(u==-1)
				System.out.println("empty");
			else
			{
				System.out.println("> Before deletion= "+(getIndex()+1));
				u=-1;
				x=new int[o];
				System.out.println("> After deletion= "+(getIndex()+1));
			}
		}
}
class main
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the no. of elements : ");
		int i,n=s.nextInt(),c;
		alist al=new alist(n);
		System.out.println("\nStart entering the elements :- ");
		for(i=0;i<n;i++)
		{
			al.add(s.nextInt());
		}
		System.out.println("ur choice");
		
		System.out.println("1 for insert");
		System.out.println("2 for deletion");
		System.out.println("3 for all delete");
		System.out.println("4 to display");
		System.out.println("5 for exit");
		
		System.out.println("ur choice");
		c=s.nextInt();
		while(c!=5)
		{
			switch(c)
			{
				case 1:
				System.out.println("Enter no");
				al.add(s.nextInt());
				System.out.println("ok");
				break;
				case 2:
				System.out.println("//no for deletion");
				al.delete(s.nextInt());
				System.out.println("ok");
				break;
				case 3:
				System.out.println("all deletion");
				al.deleteall();
				System.out.println("ok");
				break;
				case 4:
				al.traverse();
				break;
				default:
				System.out.println("Invalid ");
			}
			System.out.println("-----------------------");
			System.out.println("Enter choice");
			c=s.nextInt();
		}
		
		
		
		
		
	}
	
	
	
}