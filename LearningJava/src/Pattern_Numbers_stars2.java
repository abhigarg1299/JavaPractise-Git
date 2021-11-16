import java.util.Scanner;
public class Pattern_Numbers_stars2 {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
       int nst=1;
       int row=1;
       int cnt=1;
       int nsp=n-1;
       while(row<=n-1)
       {   int val=1;
           for(int cst=1;cst<=nst;cst++)
           {
               System.out.print(val);
               val++;
           }
           for(int stars=1;stars<=nsp;stars++)
            {
                System.out.print("*");
            }
           System.out.println();
           nsp--;
           nst++;
           row++;
    }
    for(int cst=1;cst<=n;cst++)
    {    
        System.out.print(cnt);
        cnt++;
        
    }

}

       }
       