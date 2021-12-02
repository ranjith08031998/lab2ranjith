package cg.com.lab2ranjith;

import java.util.Arrays;

public class lab2q3 {
	public static void main(String[] args)
	{
	int[] a= {17,16,21};
	System.out.print("original array: ");
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
	int[] c=getSorted(a);
	System.out.println("sorted array: "+Arrays.toString(c));
	}
	public static int[] getSorted(int[] a)
	{   for(int i=0;i<a.length;i++)
		{int b=a[i];
		int rev=0;
			while(b!=0)
			{rev=rev*10+b%10;
				b=b/10;
			}
			a[i]=rev;
		}
		System.out.println("\nreversed digit: "+Arrays.toString(a));
		Arrays.sort(a);
	//	System.out.println(Arrays.toString(a)+" *");
		return a;
	}
}
