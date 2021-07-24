import java.util.*;
class Sorting
{
    String n;
    Sorting()
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
        int count1=0,count2=0,count3=0,sum=0,temp;
        for(int i=0;i<len;i++)
        {
            temp=Array[i];
            if(temp>=49&&temp<=58)
            {
                count1++;
            }
        }
        System.out.println(count1+" no of digits");
        for(int i=0;i<len;i++)
        {
            temp=Array[i];
            if(temp>=65&&temp<=90)
            {
                count2++;
            }
        }
        System.out.println(count2+" no of capital letters");
        for(int i=0;i<len;i++)
        {
            temp=Array[i];
            if(temp>=96&&temp<=122)
            {
                count3++;
            }
        }
        System.out.println(count3+" no of small letters");
    }
    public static void main()
    {
        Sorting obj=new Sorting();
        obj.compute();
    }
}