import java.util.Scanner;

public class pattern_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=9;
        int row=1;
        int tsr=5;
        int tsp=0;
        while(row<=no)
        {
            for(int space=1;space<=tsp;space++)
            {
                System.out.print(" ");
            }
            for(int star=1;star<=tsr;star++)
            {
                System.out.print("*");
            }
            row++;
            System.out.println();
            if(row<=5)
            {
                tsp+=2;
                tsr--;
            }
            else
            {
                tsp-=2;
                tsr++;
            }
            sc.close();
        }
    }
    
}
