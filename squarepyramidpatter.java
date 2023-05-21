import java.util.Scanner;

public class squarepyramidpatter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=1;
        int no=sc.nextInt();
        int tsr=1;
        int val=1;
        int count=1;

        while(row<=no)
        {
            val=1;
            count=3;
            int star=1;
            while(star<=tsr)
            {
                System.out.print(val+" ");
                val=val+count;
                count+=2;



                star++;
            }
            row++;
            System.out.println();
            tsr++;
        }
        sc.close();
    }
    
}
