import java.util.Scanner;

public class PatternDoubleSidedArrow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int tsr=1;
        int tsp=num;
        int row=1;
        int tsp_mid=-1;
        int val=1;
        while(row<=num) 
        {
            val=tsr;
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
                val--;
                star++;
            }
            space=1;
            while(space<=tsp_mid)
            {
                System.out.print("  ");
                space++;
            }
            star=1;
            if(row==1 || row==num)
            {
                star=2;
            }
            val++;
            while(star<=tsr)
            {
                System.out.print(val+" ");
                val++;
                star++;
            }

            System.out.println();
            row++;
            if(row<=(num/2)+1)
            {
                tsp-=2;
                tsr++;
                tsp_mid+=2;
            }
            else
            {
                tsp+=2;
                tsr--;
                tsp_mid-=2;
            }

        }
        sc.close();
    }
}
