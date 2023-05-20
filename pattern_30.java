import java.util.Scanner;

public class pattern_30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int row=1;
        int tsr=num;
        int val=num;
        while(row<=num)
        {
            val=4;
            int star=1;
            while(star<=tsr)
            {
                System.out.print(val);
                val--;
                star++;
            }
            System.out.println();
            row++;
        }
        sc.close();


    }
    
}
