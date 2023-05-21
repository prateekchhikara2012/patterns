import java.util.Scanner;

public class downwordtrianglepatter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int row=1;
        int tsp=0;
        int tsr=num*2-1;
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
                if(star%2==0)
                System.out.print(" ");
                else
                System.out.print("*");
                
                star++;
            }
            System.out.println();
            row++;
            tsp++;
            tsr-=2;
        }
        sc.close();
    }
    
}
