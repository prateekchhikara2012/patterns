import java.util.Scanner;

public class HollowDiamondPattern_Pattern6
 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int tsr=num/2+1;
        int tsp=-1;
        int row=1;
        for(row=1;row<=num;row++)
        {
            int star=1;
            while(star<=tsr)
            {
                System.out.print("*"+"\t");
                star++;
            }
            int space=1;
            while(space<=tsp)
            {
                System.out.print("  \t");
                space++;
            }
            star=1;
            if(row==1 || row==num)
            star=2;

            while(star<=tsr)
            {
                System.out.print("* \t");
                star++;
            }


            
            System.out.println();
            if(row<=num/2)//2
            {
                tsr--;
                tsp+=2;
            }
            else
            {
                tsr++;
                tsp-=2;
            }
            sc.close();
        }
    }
    
}
