import java.util.*;
class GoldBach
{
    int n;
    GoldBach()
    {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%2!=0||n<5)
        {
            System.out.println("Give an even number bigger than 4 bruh");
            n=sc.nextInt();
        }
    }
    int prime(int x)
    {
        int temp=0;
        for(int i=2;i<50;i++)
        {
            if(x%i==0&&x!=i)
            {
                temp=51;
            }
        }
        if(temp==51)
        return(0);
        else
        return(x);
    }
    void check()
    {
        int sum=0,temp=0,x;
        for(int i=3;i<n;i++)
        {
            x=n-i;
            if(prime(x)==x&&x%2!=0&&x>1&&prime(i)==i&&i<=x)
            System.out.println(x+" and "+i+" make "+n);
        }
    }
    public static void main()
    {
        GoldBach obj=new GoldBach();
        obj.check();
    }
}













