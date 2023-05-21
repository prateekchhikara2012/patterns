import java.util.Scanner;


public class pascaltriangle
{
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);

        

        
        int num=sc.nextInt();




        int row=0;
        int no=num-1;
        int tsr=1;
        while(row<=no)
        {
            int col=0;
            while(col<=tsr-1)
            {



                int rowfact=1;
                for(int i=row;i>=1;i--)
                {
                    rowfact=rowfact*i;
                }
                

                int colfact=1;
                
                for(int i=col;i>=1;i--)
                {
                    colfact=colfact*i;
                }
                

                int minusfact;
                minusfact=row-col;
                int temp=1;
                
                for(int i=minusfact;i>=1;i--)
                {
                    temp=temp*i;
                    
                }


                
                

                


                int total=(rowfact)/(colfact*(temp));

                System.out.print(total);








                col++;
            }
            System.out.println();
            row++;
            tsr++;

        }















sc.close();

        







            
        
          

        


        




















      



    }
    
        
       
}