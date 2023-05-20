import java.util.Scanner;

public class pattern_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=1;
        int no=sc.nextInt();
        while(row<=no)
        {
            int col=1;
            while(col<=no)
            {
                if(row==1 || row==no || col==1 || col==no)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
                col++;
            }
            System.out.println();
            row++;
            sc.close();

        }
    }
    
}
