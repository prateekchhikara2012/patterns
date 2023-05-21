import java.util.Scanner;
public class characterpyramid
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);



        int row=1;
        int num=sc.nextInt();
        int tsr=1;
        int val=97;
        while(row<=num)
        {
            if(row%2==0)
            {
                val=98;
            }
            else
            {
                val=97;
            }

            int star=1;
            while(star<=tsr)
            {

               
                if(row%2!=0)
                {
                    System.out.print((char)(val));
                    val+=2;
                }
                else
                {

                    System.out.print((char)(val));
                    val+=2;
                }









                star++;
            }
            System.out.println();
            row++;
            tsr++;
        }

    
        sc.close();

    }
}