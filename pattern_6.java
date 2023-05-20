import java.util.Scanner;

public class pattern_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int row=1;
        int tsr=no;
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
            tsr--;
            tsp+=2;

        }
        sc.close();
    }
    
}
