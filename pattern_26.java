import java.util.Scanner;
public class pattern_26 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int row=1;
        int tsp=num-1;
        int tsr=1;
        while(row<=num)
        {
            int val=1;
            
            int space=1;
            while(space<=tsp)
            {
                System.out.print("  ");
                space++;
            }
            int star=1;
            while(star<=tsr)
            {
                System.out.print(val+" ");
                val++;
                star++;
            }
            System.out.println();
            row++;
            tsr+=2;
            tsp--;
        }
        sc.close();
    }
    
}
