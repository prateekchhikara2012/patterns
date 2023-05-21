import java.util.Scanner;

public class patternwithzeroes
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int row=1;
        int val=1;
        int tsr=1;
        while(row<=num)
        {
            val=row;
            int star=1;
            while(star<=tsr)
            {
                if(star==1 || star==tsr)
                System.out.print(val+"\t");
                else
                {
                    System.out.print("0\t");
                }
                star++;
            }
            System.out.println();
            row++;
            tsr++;
            sc.close();
        }
    }
}