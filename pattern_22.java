import java.util.Scanner;
public class pattern_22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int no=sc.nextInt();
        int tsr=no;
        int tsp=-1;
        int row=1;
        while(row<=no)
        {
            int star=1;
            while(star<=tsr)
            {
                System.out.print("*");
                star++;
            }
            int space=1;
            while(space<=tsp)
            {
                System.out.print(" ");
                space++;
            }
            star=1;
            if(row==1)
            {
                star=2;
            }
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
