import java.util.Scanner;

public class pattern_33 {
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int tsp=num;
        int row=1;
        int tsr=1;
        int val,temp=11;
        while(row<=num)
        {

            int space=1;
            while(space<=tsp)
            {
                System.out.print(" ");
                space++;
            }
            val=temp-row;
            int star=1;
            while(star<=tsr)
            {
                if(star<=tsr/2)
                {
                    System.out.print(val);
                    val++;
                }
                
                if(star==tsr/2+1)
                {
                    System.out.print("0");
                    val--;//to nuterlize
                }
                if(star>tsr/2+1)
                {
                    System.out.print(val);
                    val--;

                }
                
                star++;
            }
            System.out.println();
            row++;
            tsr+=2;
            tsp--;
            sc.close();
        }
    }

    
}

