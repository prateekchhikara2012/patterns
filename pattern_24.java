import java.util.Scanner;

public class pattern_24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int row=1;
        int tsp=num-1;
        int tsr=1;
        while(row<=num)
        {
            
            int space=1;
            while(space<=tsp)
            {
                System.out.print("  ");
                space++;
            }
            int star=1;
            while(star<=tsr)
            {
                System.out.print(row+" ");
                star++;
            }
            System.out.println();
            row++;
            tsr+=2;
            tsp--;

        }
        sc.close();
    }
    
}
