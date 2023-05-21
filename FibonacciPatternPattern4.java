import java.util.Scanner;

public class FibonacciPatternPattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=1;
        int num=sc.nextInt();
        int tsr=1;
        int a=0;
        int b=1;
        int sum=0;
        while(row<=num)
        {

            int star=1;
            while(star<=tsr)
            {
                System.out.print(a+" ");
                sum=a+b;
                a=b;
                b=sum;

                star++;
            }
            System.out.println();
            row++;
            tsr++;
        }
        sc.close();
    }
    
}
