import java.util.Scanner;

public class pattern_20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int row=1;
        int tsp_1=3;
        int tsp_2=-1;
        while(row<=no)
        {
            int space=1;
            while(space<=tsp_1)
            {
                System.out.print(" ");
                space++;
            }
            System.out.print("*");
            space=1;
            while(space<=tsp_2)
            {
                System.out.print(" ");
                space++;
            }
            if(row!=1 && row!=no)
            {
                System.out.print("*");
            }
            System.out.println();
            row++;
            if(row<=4)
            {
                tsp_1--;
                tsp_2+=2;
            }
            else
            {
                tsp_1++;
                tsp_2-=2;
            }
            sc.close();
        }
    }
    
}
