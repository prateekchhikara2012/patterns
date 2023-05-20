public class pattern_1 {
    public static void main(String[] args) {
        int row=1;
        int no=5;

        while(row<=no)
        {
            int col=1 ;
            while(col<=no)
            {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;

        }
    }
    
}
