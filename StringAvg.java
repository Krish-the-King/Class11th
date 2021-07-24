import java.util.*;
class StringAvg
{
    String n;
    StringAvg()
    {
        Scanner sc=new Scanner(System.in);
        n=sc.next();
    }
    void compute()
    {
        int len=n.length();
        int Array[]=new int[len];
        for(int i=0;i<len;i++)
        {
            Array[i]=n.charAt(i);
        }
        int count=0,sum=0,temp;
        for(int i=0;i<len;i++)
        {
            temp=Array[i];
            if(temp>=49&&temp<=58)
            {
                sum+=temp;
                count++;
            }
        }
        int avg=sum/count;
        char ch=(char)avg;
        System.out.println(ch);
    }
    public static void main()
    {
        StringAvg obj=new StringAvg();
        obj.compute();
    }
}