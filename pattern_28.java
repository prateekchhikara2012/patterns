import java.util.Scanner;
public class pattern_28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int row=1;
        int tsp=num-1;
        int tsr=1;
        int val=1;

        while(row<=num)
        {
            val=row;
            int space=1;
            while(space<=tsp)
            {
                System.out.print(" ");
                space++;
            }
            int star=1;
            while(star<=tsr)
            {
                if(star<=row-1)
                {
                    System.out.print(val);
                    val++;
                }
                else
                {
                    System.out.print(val);
                    val--;
                }
                star++;
            }
            row++;
            System.out.println();
            tsr+=2;
            tsp--;
            sc.close();
        }
    }
}
