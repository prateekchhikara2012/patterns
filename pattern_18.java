import java.util.Scanner;

public class pattern_18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int row=1;
        int tsr=1;
        int tsp=no/2;
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
            if(row<=(no/2)+1)
            {
                tsp--;
                tsr+=2;
            }
            else
            {
                tsp++;
                tsr-=2;
            }
            sc.close();
        }
        

    }
    
}
