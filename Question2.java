import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Question2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            int one=sc.nextInt();
            arr1.add(one);
        }
        for(int i=0;i<arr1.size();i++)
        {
            for(int j=0;j<arr1.size();j++)
            {
                if((arr1.get(i) == arr1.get(j))&& (i!=j))
                {
                    arr1.remove(j);
                }
            }
        }
        for(int i=0;i<arr1.size();i++)
        {
            System.out.print(arr1.get(i)+" ");
        }
    }
}