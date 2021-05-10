class a
{
    void eat()
     {
         System.out.println("Biryani");
     }
    }
class b extends  a
{
    void drink()
    {
        System.out.println("Thumps up");

    }
}
public class Singleinhar{
    public static void main (String []args){
        b s=new b();
        s.drink();
        s.eat();
    }

    


}