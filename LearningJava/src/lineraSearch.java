import java.util.Scanner;
public class lineraSearch {
    static Scanner scn=new Scanner(System.in);
    public static void main(String args[])
{
 int []arr=takeInput();
 int key=scn.nextInt();
 int search=linear(arr,key);
 System.out.print(search);
  
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
public static int linear(int [] arr,int key)
{
    for(int i=0;i<=arr.length-1;i++)
    {
        if(key==arr[i])
        {
            return i;
        }
    }
    return -1;
}

}
