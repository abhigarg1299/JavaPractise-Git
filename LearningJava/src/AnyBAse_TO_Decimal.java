import java.util.Scanner;
import java.lang.Math;
public class AnyBAse_TO_Decimal {
    
    public static void main(String args[]) {
        Scanner scn= new Scanner(System.in);
        int snum=scn.nextInt();
        int sb=scn.nextInt();
        int res=anybaseToDecimal(snum, sb);
        System.out.print(res);
    }
    public static int anybaseToDecimal(int snum,int sb)
    {
        int multiplier=0;
        int ans=0;
        while(snum!=0)
        {
            int rem=snum%10;
            ans=ans+(int)(rem*Math.pow(sb,multiplier));
            multiplier++;
            snum=snum/10;
        }
        return ans;
    }
}