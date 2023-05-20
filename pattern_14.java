import java.util.Scanner;
//this program is going to be true for odd no of rows
public class pattern_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int row=1;
        int tsr=1;
        int tsp=(no/2)+1;
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
            System.out.println();
            row++;

            if(row<=(no/2) +1)
            {
                tsp--;
                tsr++;
            }
            else
            {
                tsp++;
                tsr--;
            }

        }
        sc.close();
    }
    
}
