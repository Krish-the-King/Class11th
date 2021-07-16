import java.util.*;
class Decimal
{
    long n;
    Decimal()
    {
        Scanner sc=new Scanner(System.in);
        n=sc.nextLong();
    }
    void convert()
    {
        long temp=0,sum=0;
        for(int i=0;i<7;i++)
        {
            temp=(long)(n%10);
            sum+=(long)(temp*Math.pow(2,i));
            n=n/10;
        }
        System.out.println("Decimal answer is "+sum);
    }
    public static void main()
    {
        Decimal obj=new Decimal();
        obj.convert();
    }
}