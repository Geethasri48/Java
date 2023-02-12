import java.util.Scanner;
public class Question3{
    public static int productID[]={1,2,3,4};
        public static String productName[]={"Mobile","Earpods","Watch","Speakers"};
        public static String productDes[]={"Brands available - Realme, Iphone","Brands available - Boat, Oppo","Brands available - Titanic, Fastrack","Brands available - Sony, Samsung, Panasonic"};
        public static int productCount[]={100,50,30,20};
    public static void ProductList()
            {
                System.out.println("\nProduct Details: ");
                for(int i=0;i<productID.length;i++){
                    System.out.println(productID[i]+" : "+productName[i]+"\nCount of the devices available: "+productCount[i]);
                }
            }
            public static void StockDetails(int m){
                
                int n=m-1;
                System.out.println(productID[n]+" : "+productName[n]+"\nTotal number of gadgets available: "+productCount[n]);
            }
            public static void ProductDetails(int m){
                
                int n=m-1;
                System.out.println(productID[n]+" : "+productName[n]+" "+productDes[n]+"\nTotal number of gadgets available: "+productCount[n]);
            }
            public static void UpdateProductDetails(int m,String x){
                
                int n=m-1;
                
                String res=x;
                productName[n]=res;
                ProductDetails(m);
            }
            public static void UpdateProductCount(int m,int newone){
                int n=m-1;
                int newcount=newone;
                productCount[n]+=newcount;
                ProductDetails(m);
                
            }
    public static void main(String args[])
    {
        System.out.println("\n1.Product List\n2. Product count\n3. View Product details\n4. Update product details\n5.Update Product Count");
        System.out.println("Enter your choice: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        switch(n)
        {
            case 1:
                ProductList();
                break;
            case 2:
                System.out.println("\nEnter productId: ");
                StockDetails(sc.nextInt());
                break;
            case 3:
                System.out.println("\nEnter productId: ");
                ProductDetails(sc.nextInt());
                break;
            case 4:
                System.out.println("\nEnter productId: ");
                int d=sc.nextInt();
                System.out.println("New name of the gadget: ");
                String t=sc.nextLine();
                sc.nextLine();
                UpdateProductDetails(d,t);
                break;
            case 5:
                System.out.println("\nEnter productId: ");
                int z=sc.nextInt();
                System.out.println("Enter new count of the product: ");
                int x=sc.nextInt();
                UpdateProductCount(z,x);
                break;
            default:
                System.out.println("Invalid Input");
                break;    
        }   

    }
}