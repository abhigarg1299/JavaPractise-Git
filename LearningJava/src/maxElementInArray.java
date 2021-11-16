import java.util.Scanner;
public class maxElementInArray {
    static Scanner scn=new Scanner(System.in);
    public static void main(String args[])
    { 
        int[] array=takeInput();
        display(array);
       int maxi=maxInArray(array);
       System.out.println();
       System.out.print(maxi);
    }
    public static int[] takeInput()
    {
        System.out.println("Enter the Size");
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<=arr.length-1;i++)
        {
        arr[i]=scn.nextInt();
    }
    return arr;
}
public static void display(int[] arr)
{
    for(int i=0;i<=arr.length-1;i++)
    System.out.print(arr[i]+",");

}
public static int maxInArray(int[] arr )
{
    int max=Integer.MIN_VALUE;
    for(int i=0;i<=arr.length-1;i++)
    {
    if(arr[i]>max)
    {
        max=arr[i];
    }
}
return max;
}
}

