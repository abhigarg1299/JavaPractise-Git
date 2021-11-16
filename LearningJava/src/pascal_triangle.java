import java.util.Scanner;
class pascal_triangle {
    public int factorial(int i)
    {
        if(i==0)
        return 1;
        return i*factorial(i-1);
    }
    public static void main(String args[])
    {
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      pascal_triangle a=new pascal_triangle();
      for (int i = 0; i <= n; i++)
      {
      {
        for (int j = 0; j <= i; j++) {
            System.out.print( a.factorial(i)/ (a.factorial(i - j) * a.factorial(j)));
        }
        System.out.println();
      }

    }
}
}
