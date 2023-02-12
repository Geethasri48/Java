import java.io.*;
import java.io.File;
public class Filehandling1
{
    public static void main(String ARGS[])
    {
        String line=null;
        int count=0;
        float bill=0;
        float max=0;
        float min=999;
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("FileHandling.csv"));
            while((line=br.readLine()) !=null)
            {
                String[] transactions =line.split(",");
                bill+=Float.parseFloat(transactions[3]);
                count++;
                float num=Float.parseFloat(transactions[3]);
                if(num>max)
                {
                    max=num;
                }
                if(num<min)
                {
                    min=num;
                }
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("Total amount of bill: "+bill);
        System.out.println("Total number of transactions: "+count);
        System.out.println("maximum bill: "+max);
        System.out.println("Minimum bill: "+min);
    }
}