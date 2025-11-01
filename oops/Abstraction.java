abstract class Abstraction{
    public void display(){
        System.out.println("method");
    }
    abstract void display1();
    private int b =2;
    static int age = 10;

    public int setb(){
        return b;
    }
    
}
class Subclass extends Abstraction{
    void display1(){
        System.out.println("abstractmethod");
    }
}
public class Main{
    public static void main (String[] args){
        Subclass s1 = new Subclass();
        s1.display();
        s1.display1();
        System.out.println(s1.setb());
        System.out.println(Abstraction.age);
        

    }
}
