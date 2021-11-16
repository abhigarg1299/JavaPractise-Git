import java.util.Scanner;
import java.lang.Math;
public class quadratic {
    public static int roots(int a,int b,int c,int d)
    {   
        int root1=0;
        int root2=0;
        root1=(int)((-b+Math.sqrt(d))/(2*a));
        root2=(int)((-b-Math.sqrt(d))/(2*a));
    
        System.out.println(root2 +" "+root1);

        return 0;
    }
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
        int d=(b*b)-(4*a*c);
        if(d<0)
        {
            System.out.println("Imaginary");
            return;
        }
        if(d == 0){

            System.out.println("Real and Equal");
        }else if(d >0){
            System.out.println("Real and Distinct");
            roots(a,b,c,d);
        }
    }
}
