import java.util.Scanner;


public class PatternRhombus
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=1;

        int no=sc.nextInt();
        int num=(no*2)-1;
        int tsp=num/2;
        int tsr=1;
        int val=1;
        while(row<=num)
        {
            int space=1;
            while(space<=tsp)
            {
                System.out.print("\t");
                space++;
            }
            int star=1;
            while(star<=tsr)
            {
                System.out.print(val+"\t");
                if(star<=tsr/2)
                {
                    val++;
                }
                else
                {
                    val--;
                }
                star++;
            }
            System.out.println();
            row++;
            if(row<=(num/2)+1)
            {
                tsp--;
                val+=2;
                tsr+=2;
            }
            else
            {
                tsp++;
                tsr-=2;
            }
        }
        sc.close();
    }
}