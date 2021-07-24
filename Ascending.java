import java.util.*;
class Ascending
{
    int n;
    Ascending()
    {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
    }
    void compute()
    {
        int len=String.valueOf(n).length();
        int Array[]=new int[len];
        for(int i=0;i<len;i++)
        {
            Array[i]=n%10;
            n=n/10;
        }
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len-i-1;j++)
            {
                if(Array[j]>Array[j+1])
                {
                    int temp=Array[j+1];
                    Array[j+1]=Array[j];
                    Array[j]=temp;
                }
            }
        }
        for(int i=0;i<len;i++)
        {
            System.out.print(Array[i]);
        }
    }
    public static void main()
    {
        Ascending obj=new Ascending();
        obj.compute();
    }
}