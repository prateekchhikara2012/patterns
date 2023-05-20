import java.util.Scanner;
public class pattern_3
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int row=1;
        int tsr=3;
        while(row<=no)
        {
            for(int col=1;col<=tsr;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
            tsr--;
            row++;
        }
        sc.close(   );
        System.out.println(tsr);
    }

}