import java.util.Scanner;
public class manmohanlovespatterI {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int row=1;
        int tsr=1;
        int val;
        while(row<=num)
        {
            val=1;
            int star=1;
            while(star<=tsr)
            {
                if(row%2!=0)
                System.out.print(val);
                // odd ke liye hogya

                else//even
                {
                    if(star==1 || star==tsr)
                    {
                        System.out.print(val);
                    }
                    else
                    {
                        System.out.print("0");
                    }
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

    
    


