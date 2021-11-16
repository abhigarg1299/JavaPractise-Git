import java.util.Scanner;
public class time_hour {
    public static void main(String args[])
    {
    Scanner scn= new Scanner(System.in);
    int n =scn.nextInt();
    int nst=n;
     int nsp=0;
     while(n!=0)
     {   
        int val=n;
        int count=1;
        for(int csp=1;csp<=nsp;csp++)
        {
           System.out.print(" ");
        }
        
     for(int cst=1;cst<=nst;cst++)
     {
         System.out.print(val);
         val--;
     }
     System.out.print("0");
     for(int cst=1;cst<=nst;cst++)
     {
        
         System.out.print(count);
         count++;
     }
         System.out.println();
         n--;
         nsp++;
         nst--;
         
         
       
       
     }
     for(int csp=1;csp<=nsp;csp++)
        {
           System.out.print(" ");
        }
     System.out.print("0");
         System.out.println();
    

    }

}
