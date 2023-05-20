import java.util.Scanner;

public class pattern_31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int row=1;
        int tsr=num;
        int val=num;
        while(row<=num)
        {
            val=num;
            int star=1;
            while(star<=tsr)
            {
                if(row+star==num+1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(val);
                }
                
                val--;
                star++;
            }
            System.out.println();
            row++;
        }
        sc.close();


    }
    
}

    
