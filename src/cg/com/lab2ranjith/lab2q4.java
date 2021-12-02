package cg.com.lab2ranjith;

import java.util.Arrays;

public class lab2q4 {
	public int modifyArray(int[] a)
	{	int j = 0;
		for (int i = 0; i < a.length-1; i++)
		{
			if (a[i] != a[i+1])
			{	a[j] = a[i];
				j++;
			}
		}
        a[j++]=a[a.length-1];
		Arrays.sort(a);
		return j;
	}

	public static void main(String[] args) 
	{
		int[] a = { 1, 4, 5, 1 };
		lab2q4 ref = new lab2q4();
		Arrays.sort(a);
		int len = ref.modifyArray(a);
		for (int i = len-1; i >= 0; i--) 
		{
			System.out.print(a[i]+" ");
		}

	}
}
