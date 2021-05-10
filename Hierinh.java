class a 
{
    void a()
    {
        System.out.println("i am a");
    }
}
class b extends  a 
{
    void b()
    {
        System.out.println("i am b");

    }
}
class c extends a
{
    void c()
    {
        System.out.println("i am c");
    }
}

public class Hierinh {
    public static void main(String args[])
    {
c c1=new c();
c1.a();
c1.c();
b b2=new b();
b2.a();
b2.b();

    }
    

}