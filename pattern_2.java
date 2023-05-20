import java.util.Scanner;
public class pattern_2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=1;
        int tsr=1;
        int no=sc.nextInt();
        while(row<=no)
        {
            int col=1;
            while(col<=tsr)
            {
                System.out.print("* ");
                col++;
            } 
            System.out.println();
            row++;
            tsr++;

        }
        sc.close();
    }
    
}
