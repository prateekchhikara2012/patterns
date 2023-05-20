
import java.util.Scanner;

public class pattern_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=1;
        int no=sc.nextInt();
        while(row<=no)
        {
            int col=1;
            while(col<=no)
            {
                if(row==col || row+col==6)
                {
                    System.out.print("* ");
                    col++;
                }
                else
                {
                    System.out.print(" ");
                }
                col++;
            }
            System.out.println();
            row++;
        }
        sc.close();
    }
    
}
