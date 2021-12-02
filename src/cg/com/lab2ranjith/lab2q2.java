package cg.com.lab2ranjith;

import java.util.Arrays;

public class lab2q2 {
	 public String[] sortStrings(String[] arr)
	    {  	Arrays.sort(arr);
	        
	    return arr;
	    }
		
		public static void main(String[] args)
		{   String[] arr= {"ORANGE","BananA","Kiwi","AppLE","GrapES","PINEapple"};
			lab2q2 ref=new lab2q2();
		String[] sorted=ref.sortStrings(arr);
		for(int i=0;i<sorted.length;i++)
		{
			System.out.print(sorted[i]+" ");
		    
		}
		System.out.println();
		for(int i=(sorted.length/2)+1;i<sorted.length;i++)
		{
			System.out.print(sorted[i].toUpperCase()+" ");
		}
		}
}
