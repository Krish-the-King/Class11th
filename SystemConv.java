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
        Binary obj2=new Binary();
        obj2.convert();
    }
    public static void main()
    {
        SystemConv obj=new SystemConv();
        obj.bintodec();
        obj.dectobin();
    }
}