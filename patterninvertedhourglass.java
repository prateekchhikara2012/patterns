import java.util.Scanner;
public class patterninvertedhourglass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int no=num*2+1;
        int row=1;
        int tsr=1;
        int tsp=(num*2)-1;
        int val=num;

        while(row<=no)
        {
            val=num;
            int star=1;
            while(star<=tsr)
            {
                System.out.print(val+" ");
                val--;
                star++;
            }
            
            int space=1;
            while(space<=tsp)
            {
                System.out.print("  ");
                space++;
            }
            val++;
            if(val==0)
            {
                val=1;
            }
            star=1;
            if(row==(no+1)/2)
            {
                star=2;
            }
            while(star<=tsr)
            {
                System.out.print(val+" ");

                val++;
                star++;
            }
            System.out.println();
            row++;
            if(row<=(no/2)+1)
            {
                tsr++;
                tsp-=2;
            }
            else
            {
                tsr--;
                tsp+=2;
            }
        }
        sc.close();
    }
    
}
