import java.util.Scanner;

public class pattern_19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int row=1;
        int tsr=(no/2)+1;
        int tsp=-1;
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
            if(row==1 || row==no)
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
            if(row<=(no/2)+1)
            {
                tsr--;
                tsp+=2; 
            }
            else
            {
                tsr++;
                tsp-=2;
            }
            sc.close();

        }
    }
    
}
