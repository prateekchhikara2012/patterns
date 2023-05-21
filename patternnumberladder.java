import java.util.Scanner;

public class patternnumberladder {
    public static void main(String[] args) {
        int row=1;
        Scanner sc=new Scanner(System.in);
        int val=1;
        int num=sc.nextInt();
      int  tsr=1;
        while(row<=num)
        {
            int star=1;
            while(star<=tsr)
            {
                System.out.print(val+" ");
                val++;
                star++;
            }
            System.out.println();
            row++;
            tsr++;
        }
        sc.close();

    }
    
}
