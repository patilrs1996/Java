import java.util.*;
public class Sort //And search
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,temp=0,j;
		int a[]=new int[10];
		System.out.println("Enter array size :");
		 n=sc.nextInt();
		int beg=0,end=n-1,mid=0;
		System.out.println("Enter array elemnets :");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("After sorting array elemnets :");
		for(int i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;	
				}
			
			}
		
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		mid=(beg+end)/2;
		System.out.println("Enter key to serach :");
		int key=sc.nextInt();
		while(beg<=end)
		{
			 if(a[mid] < key)
				beg=mid+1;
			else if(a[mid]==key){
				System.out.println("Key found");
			        break;}
			else	
				end=mid-1;
			mid=(beg+end)/2;
		}
		
		if(beg>end)
			System.out.println("Key Not found");
	}

}

*********************OUTPUT*********************

F:\Java>java Sort
Enter array size :
3
Enter array elemnets :
4
2
7
After sorting array elemnets :
2
4
7
Enter key to serach :
7
Key found

F:\Java>java Sort
Enter array size :
5
Enter array elemnets :
3
8
2
4
1
After sorting array elemnets :
1
2
3
4
8
Enter key to serach :
10
Key Not found
