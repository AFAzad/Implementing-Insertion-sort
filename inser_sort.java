// Given an array A[] of size N, containing positive integers. You need to sort the elements of array using Insertion sort algorithm.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static Integer[] sort(Integer[] Arr,int n1)
    {

       int j=0,key=0;
        if(n1==0 || n1==1)
        {
            return (Arr);
        }
        else
            for(int i=1; i<n1; i++)
            {
                key = Arr[i];
                for(j=i-1; j>=0; j--)
                {
                    Integer predecessor = Arr[j];
                    if(predecessor>=key)
                    {
                        Arr[j+1]=predecessor;
                    }
                    else
                        break;
                    
                }Arr[j+1]=key;
            }
        return Arr;
    }



    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
       
        for(int k=1; k<=n; k++)
        {
            int n1= sc.nextInt();
            Integer[] Arr = new Integer[n1];
            for(int i=0; i<n1; i++)
            {
                Arr[i]=sc.nextInt();
            }

            Arr=sort(Arr,n1);
            for(int i=0; i<n1; i++)
            {
                System.out.print(Arr[i]+" ");
            }
            System.out.print('\n');
        }
    }

}