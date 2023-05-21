import java.util.Scanner;

public class mirrorstarpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int row=1;
        int tsp=num/2;
        int tsr=1;
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
                System.out.print("*");
                star++;
            }
            System.out.println();
            row++;
            if(row<=(num/2)+1)
            {
                tsr+=2;
                tsp--;
            }
            else
            {
                tsr-=2;
                tsp++;
            }
            sc.close();
        }
    }
    
}
