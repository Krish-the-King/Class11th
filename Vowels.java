import java.util.*;
class Vowels
{
    String s;
    Vowels()
    {
        Scanner sc=new Scanner(System.in);
        s=sc.next();
    }
    void check()
    {
        String v="",c="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                v+=s.charAt(i);
            }
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='a'&&s.charAt(i)!='e'&&s.charAt(i)!='i'&&s.charAt(i)!='o'&&s.charAt(i)!='u')
            {
                c+=s.charAt(i);
            }
        }
        System.out.println(v+"\n"+c);
    }
    public static void main()
    {
        Vowels obj=new Vowels();
        obj.check();
    }
}