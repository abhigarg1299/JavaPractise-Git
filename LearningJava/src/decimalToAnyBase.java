import java.util.Scanner;
class decimalToAnyBase {
    public static void main(String args [])
    {
        Scanner scn= new Scanner(System.in);
        int snum=scn.nextInt();
        int db=scn.nextInt();
        int res=decimalToAnyBase(snum, db);
        System.out.print(res);

    }
    public static int decimalToAnyBase(int snum,int db)
    {
        int multiplier=0;
        int ans=0;
        while(snum!=0)
        {
            int rem=snum%db;
            ans=ans+(int)(rem*Math.pow(10,multiplier));
            multiplier++;
            snum=snum/db;
        }
        return ans;
    }
}