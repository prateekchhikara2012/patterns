import java.util.Scanner;

public class HollowRhombusPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int tsp=num-1;
        int tsr=num;
        int row=1;
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

                if(row==1 || row==num)
                {
                    System.out.print("*");
                }
                else
                {
                    if(star==1 || star==tsr)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                star++;
            }
            System.out.println();
            row++;
            tsp--;
        }
        sc.close();
    }
    
}
