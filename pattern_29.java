import java.util.Scanner;
public class pattern_29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int row=1;
        int tsp=num-1;
        int tsr=1;
        int val=1;

        while(row<=num)
        {
            val=row;
            int space=1;
            while(space<=tsp)
            {
                System.out.print(" ");
                space++;
            }
            int star=1;
            while(star<=tsr)
            {
                if(star==1 || star==tsr)
                {
                    System.out.print(val);
                }
                else
                {
                    System.out.print("0");
                }
                star++;
            }
            row++;
            System.out.println();
            tsr+=2;
            tsp--;
            sc.close();
        }
    }
}
