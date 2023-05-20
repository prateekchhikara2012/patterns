import java.util.Scanner;

public class pattern_32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int row=1;
        int tsr=1;
        int val=1;
        while(row<=num)
        {
            int star=1;
            while(star<=tsr)
            {
                if(star%2!=0)
                System.out.print(val);
                else
                System.out.print("*");

                star++;
            }
            System.out.println();
            
            if(row<=num/2)
            {
                tsr+=2;
                val++;
            }
            else
            {
                tsr-=2;
                val--;
            }
            row++;
        }
        sc.close();
    }
    
}
