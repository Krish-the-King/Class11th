import java.util.*;
class CircPrime
{
    int n;
    CircPrime()
    {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
    }
    int prime(int x)
    {
        int temp=x;
        for(int i=2;i<=x;i++)
        {
            if(x%i==0&&x!=i)
            temp=0;
        }
        return(temp);
    }
    void circ()
    {
        int len=String.valueOf(n).length();
        int sum=n,temp,count=0;
        for(int i=0;i<=len;i++)
        {
            temp=sum%10;
            sum=sum/10;
            sum+=(int)(temp*Math.pow(10,len-1));//remainder multiplied
            if(sum!=prime(sum))
            count++;
        }
        if(count==0)
        System.out.println("Circ Prime");
        else
        System.out.println("not Circ Prime");        
    }
    public static void main()
    {
        CircPrime obj=new CircPrime();
        obj.circ();
    }
}






