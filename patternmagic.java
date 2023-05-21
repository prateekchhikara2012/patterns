import java.util.Scanner;

public class patternmagic {
    public static void main(String[] args) {
        int row=1;
        Scanner sc=new Scanner(System.in);

        int no=sc.nextInt();
        int num=(no*2)-1;
        int tsr=no;
        int tsp=-1;
        while(row<=num)
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
            if(row==1 || row==num)
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
            if(row<=(num/2)+1)
            {
                tsr--;
                tsp+=2;
            }
            else
            {
                tsr++;
                tsp-=2;
            }
        }sc.close();
    }
    
}
