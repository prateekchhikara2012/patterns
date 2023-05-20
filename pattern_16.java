import java.util.Scanner;

public class pattern_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int tsr=(num/2)+1;
        int tsp=num/2;
        int row=1;
        while(row<=num )
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

            if(row<=(num/2)+1)
            {
                tsr--;
                tsp--;
            }
            else
            {
                tsr++;
                tsp++;
            }
            sc.close();

        }

    }
    
}
