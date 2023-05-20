import java.util.Scanner;


public class pattern_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int row=1;
        int tsr=1;
        int tsp=4;

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
            tsr++;
            row++;
            tsp--;
            sc.close();

        }
    }
    
}
