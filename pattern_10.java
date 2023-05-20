import java.util.Scanner;

public class pattern_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=1;
        int no=sc.nextInt();
        int tsr=9;
        int tsp=0;

        while(row<=no)
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
                System.out.print("*");
                star++;
            }
            System.out.println();
            row++;
            tsr-=2;
            tsp++;
            sc.close();

        }
    }
}
