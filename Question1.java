import java.util.*;
import java.util.Scanner;
public class Question1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int e=0;
        for(int i=1;i<=arr[n-1];i++){
            for(int j=0;j<n;j++){
                if(i==arr[j]){
                   e++;
                }
            }
            if(e==0){
                System.out.print(i+" ");
            }
            e=0;
        }
    }
}