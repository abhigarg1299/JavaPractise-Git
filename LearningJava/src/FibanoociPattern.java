import java.util.Scanner;
public class FibanoociPattern {
    public int fibbonacci(int i) {
        if(i == 0){
           return 0;
        } else if(i == 1) {
           return 1;
        } else {
           return (fibbonacci(i-1) + fibbonacci(i-2));
        }
     }
     
    public static void main(String args[])
    {
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
     FibanoociPattern a=new FibanoociPattern();
     int row=1;
     System.out.print("0");
     System.out.println();
     System.out.print("1");
     while(row<=n)
     {
      for (int i = 1; i <= n; i++)
    {
            System.out.print( a.fibbonacci(i));
     }
        System.out.println();
      row++;
    }
}
}