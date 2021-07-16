import java.util.*;
class SystemConv
{
    SystemConv()
    {
        Scanner sc=new Scanner(System.in);
    }
    void bintodec()
    {
        Decimal obj1=new Decimal();
        obj1.convert();
    }
    void dectobin()
    {
        DecToBin obj2=new DecToBin();
        obj2.convert();
    }
    public static void main()
    {
        SystemConv obj=new SystemConv();
        obj.bintodec();
        obj.dectobin();
    }
}