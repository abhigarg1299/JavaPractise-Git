import java.util.Scanner;
public class bubblesort {
    static Scanner scn=new Scanner(System.in);
    public static void main(String args[])
{
 int []arr={99,88,77,66,55};
 bubbleSort(arr);
 display(arr);
 
  
}
public static int[] takeInput()
    {
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<=arr.length-1;i++)
        {
        arr[i]=scn.nextInt();
    }
    return arr;
}
public static void bubbleSort(int [] arr)
{
    for(int i=0;i<arr.length-1;i++)
    {
        for(int j=0;j<arr.length-1-i;j++)
        if(arr[j]>arr[j+1])
        {
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
           
        }
    }

}
public static void display(int[] arr)
{
    for(int i=0;i<=arr.length-1;i++)
    System.out.print(arr[i]+",");

}


}
