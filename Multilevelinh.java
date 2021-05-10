class Statrup
{
    void Starts()
    {
System.out.println("Fried chicken");
    }
}
class Mains extends Statrup
{
    void Mainsss()
    {
        System.out.println("Biryani");
    }
}
class Bewarages extends Mains{
    void Bewaragesss()
    {
        System.out.println("Thums up");
    }
}
public class Multilevelinh
{
    public static void main(String[]args)
    {
        Bewarages b=new Bewarages();
        b.Starts();
        b.Mainsss();

        b.Bewaragesss();

    }
}