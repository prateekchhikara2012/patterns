import java.util.Scanner;
public class ManmohanlovespatterII {



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int row=1;
        int tsr=1;
        int val;
        while(row<=num)
        {
            val=row;
            if(row>=2)
            {
                val--;
            }
            int star=1;
            while(star<=tsr)
            {
                if(star==1 || star==tsr)
                System.out.print(val);
                else
                System.out.print("0");
                star++;
            }
            System.out.println();
            row++;
            tsr++;
        }
        sc.close();
    }
    
}

    