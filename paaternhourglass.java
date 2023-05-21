import java.util.Scanner;

public class paaternhourglass {
    public static void main(String[] args) {
        int row=1;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int tsr=7;
        int tsp=0;
        int val=3;
        while(row<=num)
        {
            int space=1;
            while(space<=tsp)
            {
                System.out.print(" ");
                space++;
            }

            int star=1;
            while(star<=tsr)
            {
                System.out.print(val);
                if(star<=tsr/2)
                {
                    val--;
                }
                else
                {
                    val++;
                }
                star++;
            }
            System.out.println();
            row++;//4
            if(row<=4)
            {
                val-=2;
                tsp++;
                tsr-=2;
            }
            else
            {
                tsp--;
                tsr+=2;
            }
            sc.close();
        }

    }

    
}
