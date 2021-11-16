import java.util.Scanner;
public class Pattern_Numbers_Stars {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int rows=2;
        int val=1;
        int nst=1;
        for(int cst=1;cst<=n;cst++)
            {
               
                System.out.print(val+" ");
                val++;
                
            }
            System.out.println();
        while(rows<=n)
        {   int num=1;
            
            for(int cst=1;cst<=n-1;cst++)
            {
                System.out.print(num+" ");
                num++;
                
            }
          
            for(int stars=1;stars<=nst;stars++)
            {
                System.out.print("*"+" ");
            }
            n--; 
            System.out.println();  
            nst=nst+2;
        }
      
        rows=rows+1;
    }
}