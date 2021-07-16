import java.util.*;
class Binary
{
    int n;
    Binary()
    {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
    }
    void convert()
    {
        int sum=n, temp,bin=0;
        for(int i=0;i<8;i++)
        {
            temp=(int)(sum/(Math.pow(2,7-i)));//2 raised to power of its index(7-i is for index)
            sum=(int)(sum%(Math.pow(2,7-i)));
            bin+=temp*(Math.pow(10,7-i));
        }
        System.out.println("The binary answer is "+bin);
    }
    public static void main()
    {
        Binary obj=new Binary();
        obj.convert();
    }
}