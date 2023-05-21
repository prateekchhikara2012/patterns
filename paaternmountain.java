import java.util.Scanner;

public class paaternmountain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int row=1;
        int tsr=1;
        int tsp=num+1;
        int val=0;
        while(row<=num)
        {
            val=1;
            int star=1;
            while(star<=tsr)
            {
                System.out.print(val);
                val++;
                star++;
            }
            int space=1;
            while(space<=tsp)
            {
                System.out.print(" ");
                space++;
            }
            star=1;
            if(row==num)
            {
                star=2;
                val--;
            }
            val--;
            while(star<=tsr)
            {
                System.out.print(val);
                val--;
                star++;
            }
            System.out.println();
            row++;
            tsr++;
            tsp-=2;
            sc.close();
        }
    }
    
}
