import java.util.*;
class Carton
{
    int n;
    Carton()
    {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
    }
    void compute()
    {
        int temp=0,n1=n;
        for(int i=1;i<5;i++)
        {
            temp=(int)(n1/(6*Math.pow(2,4-i)));
            System.out.println(temp+" "+(int)(6*Math.pow(2,4-i))+" boxes are needed");
            n1=(int)(n1%(6*Math.pow(2,4-i)));
        }
        if(n%6<6&&n%6>0)
        System.out.println("1 non full 6 box is needed");
    }
    public static void main()
    {
        Carton obj=new Carton();
        obj.compute();
    }
}