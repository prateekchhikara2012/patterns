import java.util.Scanner;

public class pattern_12 {
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
                
                if(star%2==0)
                {
                    System.out.print("!");
                }
                else
                {
                    System.out.print("*");
                }
                star++;
            }
            System.out.println();
            row++;
            tsr+=2;
            tsp--;
            sc.close();

        }
        
    }
    
}
